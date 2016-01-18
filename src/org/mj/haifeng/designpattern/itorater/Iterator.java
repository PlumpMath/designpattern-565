package org.mj.haifeng.designpattern.itorater;

public interface Iterator {
	
	public Object previous();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();

}
