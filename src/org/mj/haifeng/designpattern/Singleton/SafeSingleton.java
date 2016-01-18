package org.mj.haifeng.designpattern.Singleton;

/**
 * @author haifeng
 * ʵ������ǣ�����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
 * �����ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��
 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ�
 * �������ǾͲ��õ�����������⡣ͬʱ�÷���Ҳֻ���ڵ�һ�ε��õ�ʱ��ʹ�û�����ƣ�
 * �����ͽ���˵��������⡣����������ʱ�ܽ�һ�������ĵ���ģʽ
 */
public class SafeSingleton {
	
	private SafeSingleton() {
		
	}
	
	private static class SingletonFactory {     //�ڲ�����ά��������ʵ��
		private static SafeSingleton instance = new SafeSingleton();
	}
	
	public SafeSingleton getInstance() {
		
		return SingletonFactory.instance;
	}
	
	public Object readResolve() {
		return getInstance();
	}
}
