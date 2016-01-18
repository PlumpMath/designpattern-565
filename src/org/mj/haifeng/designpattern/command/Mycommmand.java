package org.mj.haifeng.designpattern.command;

/**
 * @author haifeng
 * 
 * �����ʵ���б�ȻҪЯ������ִ���ߵĶ���
 */
public class Mycommmand implements Command {

	private Receiver receiver;
	
    public Mycommmand(Receiver receiver) {
		
    	this.receiver = receiver;
	}
	
	@Override
	public void exe() {
		
		receiver.action();

	}

}
