package org.mj.haifeng.designpattern.visitor;

/**
 * @author haifeng
 * 
 * ����������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬�ɴﵽΪһ����������
 * ��̬�����µĲ����������������޸ĵ�Ч��
 * 
 * �����ݽṹ���㷨����
 * 
 * subject�����ݽṹ��vistor���㷨
 */
public class Test {

	public static void main(String[] args) {


		Visitor visitor = new MyVisitor();
		
		Subject subject = new MySubject();
		
		subject.accept(visitor);

	}

}
