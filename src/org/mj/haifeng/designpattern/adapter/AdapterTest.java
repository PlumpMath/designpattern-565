package org.mj.haifeng.designpattern.adapter;

/**
 * @author haifeng
 * 
 * 接口的实现类并没有重写method1的方法，但是已经可以使用
 * 这就是适配器
 */
public class AdapterTest {

	public static void main(String[] args) {
		/*Targetable target = new Adapter();
		
		target.method1();
		target.method2();*/
		
		Source source = new Source();
		Targetable target = new Wrapper(source);
		
		target.method1();
		target.method2();

	}

}
