package org.mj.haifeng.designpattern.abstractfactory;

import org.mj.haifeng.designpattern.factory.Sender;

/**
 * @author haifeng
 *
 * ���󹤳��ĺô��ǣ�����Ҫ��չ�µ�ҵ��ʱ������Ҫ�޸�ԭ�еĹ����ֻ࣬��Ҫ���
 * ��Ӧ��һ�������࣬ʵ��Provider�ӿھͿ�����
 * 
 * ��ʱ��produce������Ȼ�Ͳ������óɾ�̬�����ˣ���Ϊ����Ҫ��������д��
 */
public interface Provider {
	
	public Sender produce();
	

}
