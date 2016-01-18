package org.mj.haifeng.designpattern.factory;

/**
 * @author haifeng
 *
 * 不同的工厂类
 */

public class SenderFactory {
	
	
	/*public Sender produce(String Type) {
		if ("MailSender".equals(Type)) {
			return new MailSender();
		} else if ("SmsSender".equals(Type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确类型");
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
	 * 将工厂的方法设置为静态的，使用工厂时就不能new对象了
	 * 
	 * 但是如果想扩展程序，就必须修改工厂类，这就违反了闭包原则
	 */
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
