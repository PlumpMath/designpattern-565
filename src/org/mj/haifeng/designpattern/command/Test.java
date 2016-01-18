package org.mj.haifeng.designpattern.command;

/**
 * @author haifeng
 * 
 * 命令模式的目的就是达到命令的出发者和执行者之间解耦，实现请求和执行分开
 * 
 * Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想
 */
public class Test {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Command command = new Mycommmand(receiver);
		
		Invoker invoker = new Invoker(command);
		
		invoker.action();

	}

}
