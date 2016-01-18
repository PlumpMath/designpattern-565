package org.mj.haifeng.designpattern.adapter;

/**
 * @author haifeng
 *
 * 对象的适配器，持有Source类的实例
 */
public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();          //这时，方法的名字不一样也是没有关系的

	}

	@Override
	public void method2() {
		System.out.println("this is the Targetable method!");

	}

}
