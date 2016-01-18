package org.mj.haifeng.designpattern.bridge;

public class BridgeMy {
	
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
