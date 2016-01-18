package org.mj.haifeng.designpattern.Proxy;


/**
 * @author haifeng
 *
 * ��װ�����е���ѽ��ֻ�����������Լ�new��һ��Source
 * 
 * ���еķ�����ʹ�õ�ʱ����Ҫ��ԭ�з������иĽ�����ʱ�����ְ취
 * �޸�ԭ�з�������Ӧ��������Υ���ˡ�����չ���ţ����޸Ĺرա���ԭ��
 * ���ô��������ԭ�еķ������ҶԲ����Ľ�����п��ƣ�����Ǵ���ģʽ
 * 
 * ʹ�ô���ģʽ�����Խ����ܻ��ֵĸ��������������ں���ά��
 */

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		
		source.method();
		
		after();

	}

	private void after() {

		System.out.println("after proxy!");
	}

	private void before() {

		System.out.println("before proxy!");
	}

}
