package org.mj.haifeng.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

import org.mj.haifeng.designpattern.factory.MailSender;
import org.mj.haifeng.designpattern.factory.Sender;
import org.mj.haifeng.designpattern.factory.SmsSender;

/**
 * @author haifeng
 * ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ������������
 * �������϶���
 * 
 * �������Դ�����Ƚϸ��ӵĶ��������Ǳ�����Ķ������϶����������𱣹ܿ�
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
