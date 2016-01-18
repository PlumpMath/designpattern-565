package org.mj.haifeng.designpattern.memento;

/**
 * @author haifeng
 * original可以创建备忘录，把需要记下的东西放在备忘录中
 */
public class Original {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Original(String value) {

		this.value = value;
		
	}
	
	public Memento createMemento() {
		return new Memento(value);
	}
	
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

}
