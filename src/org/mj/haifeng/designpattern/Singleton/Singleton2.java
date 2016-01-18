package org.mj.haifeng.designpattern.Singleton;

/**
 * @author haifeng
 *
 * ����ֻҪ��������getInstance()�ֿ�������Ϊ������synchronized�ؼ���
 */
public class Singleton2 {
	
	private Singleton2() {
		
	}
	
	private static Singleton2 instance = null;
	
	private static synchronized void sysInit() {
		if (instance == null) {
			instance = new Singleton2();
		}
	}
	
	public Singleton2 getInstance() {
		if (instance == null) {
			sysInit();
		}
		return instance;
	}

}
