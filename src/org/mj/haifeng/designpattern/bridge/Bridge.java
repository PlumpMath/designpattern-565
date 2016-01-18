package org.mj.haifeng.designpattern.bridge;

/**
 * @author haifeng
 * 
 * ����ඨ��ɳ�������ʲô���ã����ﲻ�������ͨ�࣬ʹ��ʱֱ��new Bridge()�������ˣ���
 * ������д��BridgeMy�����
 */
public abstract class Bridge {
	
	private Sourceable source;
	
	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	

}
