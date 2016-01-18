package org.mj.haifeng.designpattern.abstractfactory;

import org.mj.haifeng.designpattern.factory.Sender;
import org.mj.haifeng.designpattern.factory.SmsSender;

public class SmsSenderFactory implements Provider {


	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
