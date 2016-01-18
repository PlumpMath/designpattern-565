package org.mj.haifeng.designpattern.facade;

public class User {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		computer.startup();
		
		computer.shutdown();
				
	}
}
