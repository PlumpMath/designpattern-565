package org.mj.haifeng.designpattern.observer;

public interface Subject {
	
	//���ӹ۲���
	public void add(Observer observer);
	
	//ɾ���۲���
	public void del(Observer observer);
	
	//֪ͨ���й۲���
	public void notifyObservers();
	
	//����Ĳ���
	public void operation();

}
