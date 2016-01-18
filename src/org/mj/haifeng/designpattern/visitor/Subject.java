package org.mj.haifeng.designpattern.visitor;

public interface Subject {

	public void accept(Visitor visitor);
	
	public String getSubject();
}
