package org.mj.haifeng.designpattern.factory;



/**
 * @author haifeng
 *
 * ʹ�ù���ģʽ�ĺô��ǣ���ֻ��Ҫ��ע�������������ʲô��������Ҫ��ע���Ƿ�����Щ��Ʒ
 * ������ʲô��˵����ʲô
 *1
 * ������ݵ��ַ����������ܷ�����ȷ�Ķ���
 * 
 * ��̬��������ģʽʹ�õ����
 */
public class SenderFactoryTest {
	
	public static void main(String[] args) {
		
		/*SenderFactory factory = new SenderFactory();*/
		
		/*Sender sender  =  factory.produce("MailSende");*/
		
		/*Sender sender = factory.produceMail();*/
		
		Sender sender = SenderFactory.produceMail();
		
		sender.send();
	}

}
