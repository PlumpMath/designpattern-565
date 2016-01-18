package org.mj.haifeng.designpattern.visitor;

/**
 * @author haifeng
 * 
 * 分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者
 * 动态增加新的操作而无需做其它修改的效果
 * 
 * 把数据结构和算法解耦
 * 
 * subject是数据结构，vistor是算法
 */
public class Test {

	public static void main(String[] args) {


		Visitor visitor = new MyVisitor();
		
		Subject subject = new MySubject();
		
		subject.accept(visitor);

	}

}
