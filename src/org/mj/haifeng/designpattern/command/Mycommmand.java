package org.mj.haifeng.designpattern.command;

/**
 * @author haifeng
 * 
 * 命令的实现中必然要携带命令执行者的对象
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
