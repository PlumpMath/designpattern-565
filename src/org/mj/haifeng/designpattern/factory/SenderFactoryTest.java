package org.mj.haifeng.designpattern.factory;



/**
 * @author haifeng
 *
 * 使用工厂模式的好处是：我只需要关注这个工厂能生产什么，而不需要关注我是否有这些产品
 * 能生产什么就说明有什么
 *1
 * 如果传递的字符串出错，则不能返回正确的对象
 * 
 * 静态工厂方法模式使用的最多
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
