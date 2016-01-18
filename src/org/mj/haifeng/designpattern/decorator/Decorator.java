package org.mj.haifeng.designpattern.decorator;

/**
 * @author haifeng
 *
 * ��Ҫ��չһ����Ĺ���ʱ
 * ��̬Ϊһ���������ӹ��ܣ����ܶ�̬�������̳���������һ��̳еĹ����Ǿ�̬�ģ����ܶ�̬ɾ
 * 
 * ȱ�㣺�����������ƵĶ��󣬲����Ŵ�                                 û��������
 */
public class Decorator implements Sourceable {

	private Sourceable source;
	
	
	
	public Decorator(Sourceable source) {        //�����װ����ʱ��Ҫ���뱻װ�εĶ���
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
