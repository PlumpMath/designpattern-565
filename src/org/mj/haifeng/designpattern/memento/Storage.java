package org.mj.haifeng.designpattern.memento;

/**
 * @author haifeng
 * 
 * 负责存放备忘录
 */
public class Storage {
	
	private Memento memento;
	
	public Storage(Memento memento) {
		
		this.memento = memento;
		
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	

}
