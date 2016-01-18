package org.mj.haifeng.designpattern.memento;

public class Test {
	
	public static void main(String[] args) {
		
		Original org = new Original("something");
		
		Storage storage = new Storage(org.createMemento());
		
		
		System.out.println("original state: " + org.getValue());
		
		org.setValue("something changed");
		
		System.out.println("be changed: " + org.getValue());
		
		
		org.restoreMemento(storage.getMemento());
		
		System.out.println("state be reset: " + org.getValue());
		
	}

}
