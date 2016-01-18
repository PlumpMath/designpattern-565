package org.mj.haifeng.designpattern.abstractfactory;

import org.mj.haifeng.designpattern.factory.Sender;

public class ProvierTest {

	public static void main(String[] args) {
		Provider provider = new SmsSenderFactory();
		
		Sender sender = provider.produce();
		
		sender.send();

	}

}
