package org.mj.haifeng.designpattern.abstractfactory;

import org.mj.haifeng.designpattern.factory.MailSender;
import org.mj.haifeng.designpattern.factory.Sender;

public class MailSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
