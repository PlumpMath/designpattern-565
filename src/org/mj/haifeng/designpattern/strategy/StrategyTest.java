package org.mj.haifeng.designpattern.strategy;

public class StrategyTest {
	
	public static void main(String[] args) {
		String exp = "2-8";
		
		ICalculator calculator = new Minus();
		
		int result = calculator.calculate(exp);
		
		System.out.println(result);
	}

}
