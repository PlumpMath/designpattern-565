package org.mj.haifeng.designpattern.Singleton;

/**
 * @author haifeng
 *
 * 所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
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
