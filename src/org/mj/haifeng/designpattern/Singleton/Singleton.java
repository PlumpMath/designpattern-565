package org.mj.haifeng.designpattern.Singleton;

/**
 * @author haifeng
 *
 */

public class Singleton {
	
	/**
	 * 实现延迟加载
	 */
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	
	/**
	 * 毫无线程安全
	 * @return
	 */
	/*public static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		} else {
			return instance;
		}
		
	}*/
	
	/**
	 * 解决了线程安全，但是性能会下降，锁的粒度有点大
	 * 每次getInstance都要对对象上锁。事实上只要对第一次创建对象的时候加锁就可以了
	 * @return
	 */
	
	/*public static synchronized Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		} else {
			return instance;
		}
		
	}*/
	
	/**
	 * 
	 * 缩小锁的粒度
	 * 但是，这样的情况，还是有可能有问题的，看下面的情况：在Java指令中创建对象和赋值操作是分开进行的，
	 * 也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，
	 * 也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，
	 * 然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例
	 * 
	 * a>A、B线程同时进入了第一个if判断

     * b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();

     * c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。

     * d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。

     * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。

     * 所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。我们对该程序做进一步优化：
	 * @return
	 */
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {         //在此处将对象instance锁住，
				if (instance == null) {               //*********详见synchronnized的用法
				
					instance = new Singleton();
				}
			}
		} 
		
		return instance;
	}
	
	public Object readResolve() {
		return instance;
		
	}

}
