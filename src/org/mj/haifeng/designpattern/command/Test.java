package org.mj.haifeng.designpattern.command;

/**
 * @author haifeng
 * 
 * ����ģʽ��Ŀ�ľ��Ǵﵽ����ĳ����ߺ�ִ����֮����ʵ�������ִ�зֿ�
 * 
 * Struts��ʵ����һ�ֽ�����ͳ��ַ���ļ��������б�Ȼ�漰����ģʽ��˼��
 */
public class Test {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Command command = new Mycommmand(receiver);
		
		Invoker invoker = new Invoker(command);
		
		invoker.action();

	}

}
