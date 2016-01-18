package org.mj.haifeng.designpattern.bridge;

/**
 * @author haifeng
 * 
 * 这个类定义成抽象类有什么作用，干嘛不定义成普通类，使用时直接new Bridge()不就行了？？
 * 例如我写的BridgeMy这个类
 */
public abstract class Bridge {
	
	private Sourceable source;
	
	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	

}
