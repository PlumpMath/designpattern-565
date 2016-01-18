package org.mj.haifeng.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

import org.mj.haifeng.designpattern.factory.MailSender;
import org.mj.haifeng.designpattern.factory.Sender;
import org.mj.haifeng.designpattern.factory.SmsSender;

/**
 * @author haifeng
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来管理
 * 创建复合对象
 * 
 * 这个类可以创造出比较复杂的东西，但是被创造的东西，肯定是由它负责保管咯
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for(int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count) {
		for(int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

}
