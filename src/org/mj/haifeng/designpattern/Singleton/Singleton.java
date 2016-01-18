package org.mj.haifeng.designpattern.Singleton;

/**
 * @author haifeng
 *
 */

public class Singleton {
	
	/**
	 * ʵ���ӳټ���
	 */
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	
	/**
	 * �����̰߳�ȫ
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
	 * ������̰߳�ȫ���������ܻ��½������������е��
	 * ÿ��getInstance��Ҫ�Զ�����������ʵ��ֻҪ�Ե�һ�δ��������ʱ������Ϳ�����
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
	 * ��С��������
	 * ���ǣ�����������������п���������ģ���������������Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�
	 * Ҳ����˵instance = new Singleton();����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳��
	 * Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��
	 * Ȼ����ȥ��ʼ�����Singletonʵ���������Ϳ��ܳ����ˣ�������A��B�����߳�Ϊ��
	 * 
	 * a>A��B�߳�ͬʱ�����˵�һ��if�ж�

     * b>A���Ƚ���synchronized�飬����instanceΪnull��������ִ��instance = new Singleton();

     * c>����JVM�ڲ����Ż����ƣ�JVM�Ȼ�����һЩ�����Singletonʵ���Ŀհ��ڴ棬����ֵ��instance��Ա��ע���ʱJVMû�п�ʼ��ʼ�����ʵ������Ȼ��A�뿪��synchronized�顣

     * d>B����synchronized�飬����instance��ʱ����null������������뿪��synchronized�鲢��������ظ����ø÷����ĳ���

     * e>��ʱB�̴߳���ʹ��Singletonʵ����ȴ������û�б���ʼ�������Ǵ������ˡ�

     * ���Գ������п��ܷ���������ʵ���������й����Ǻܸ��ӵģ���������ǾͿ��Կ�������������д���̻߳����µĳ�������Ѷȣ�����ս�ԡ����ǶԸó�������һ���Ż���
	 * @return
	 */
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {         //�ڴ˴�������instance��ס��
				if (instance == null) {               //*********���synchronnized���÷�
				
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
