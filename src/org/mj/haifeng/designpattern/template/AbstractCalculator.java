package org.mj.haifeng.designpattern.template;


/**
 * @author haifeng
 * 模板与策略模式的区别就是，模板是一个抽象类，有一个主方法，再定义1...n个方法，可以是抽象的
 */
public abstract class AbstractCalculator {
	
	/* 主方法，实现对本类其他方法的调用*/
	
	public final int calculate(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}
	
	abstract public int calculate(int num1, int num2);
	
	/* 被子类重写的方法*/
	public int[] split(String exp, String opt) {
		
		String array[] = exp.split(opt);
		
		int arrayInt[] = new int[2];
		
		arrayInt[0] = Integer.parseInt(array[0]);
		
		arrayInt[1] = Integer.parseInt(array[1]);
		
		return arrayInt;
	}

}
