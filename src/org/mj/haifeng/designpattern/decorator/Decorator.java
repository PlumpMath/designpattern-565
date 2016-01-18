package org.mj.haifeng.designpattern.decorator;

/**
 * @author haifeng
 *
 * 需要扩展一个类的功能时
 * 动态为一个对象增加功能，还能动态撤销，继承做不到这一点继承的功能是静态的，不能动态删
 * 
 * 缺点：产生过多相似的对象，不易排错！                                 没懂？？？
 */
public class Decorator implements Sourceable {

	private Sourceable source;
	
	
	
	public Decorator(Sourceable source) {        //构造此装饰类时，要传入被装饰的对象
		super();
		this.source = source;
	}



	@Override
	public void method() {

		System.out.println("before decorator!");
		
		source.method();
		
		System.out.println("after decorator!");
		
	}

}
