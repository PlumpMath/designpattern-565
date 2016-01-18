package org.mj.haifeng.designpattern.factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is SmsSender");

	}

}
