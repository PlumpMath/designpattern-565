package org.mj.haifeng.designpattern.factory;

/**
 * @author haifeng
 *
 * ��ͬ�Ĺ�����
 */

public class SenderFactory {
	
	
	/*public Sender produce(String Type) {
		if ("MailSender".equals(Type)) {
			return new MailSender();
		} else if ("SmsSender".equals(Type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ����");
			return null;
		}
	}*/
	
	/*public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}*/

	
	/**
	 * @author haifeng
	 *
	 * �������ķ�������Ϊ��̬�ģ�ʹ�ù���ʱ�Ͳ���new������
	 * 
	 * �����������չ���򣬾ͱ����޸Ĺ����࣬���Υ���˱հ�ԭ��
	 */
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
