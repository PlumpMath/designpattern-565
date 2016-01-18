package org.mj.haifeng.designpattern.adapter;

/**
 * @author haifeng
 *
 * �����������������Source���ʵ��
 */
public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();          //��ʱ�����������ֲ�һ��Ҳ��û�й�ϵ��

	}

	@Override
	public void method2() {
		System.out.println("this is the Targetable method!");

	}

}
