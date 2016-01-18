package org.mj.haifeng.designpattern.adapter;

/**
 * @author haifeng
 *
 * ���������������ͨ����һ��Source�࣬ӵ��һ����������ƥ�䣬һ��Ŀ��ӿ�
 * ͨ��adaptϵ�Ǹ�Source�Ĺ�����չ��Targetable��
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");

	}

}
