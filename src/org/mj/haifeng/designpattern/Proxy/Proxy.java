package org.mj.haifeng.designpattern.Proxy;


/**
 * @author haifeng
 *
 * 和装饰器有点像呀，只不过代理是自己new了一个Source
 * 
 * 已有的方法在使用的时候需要对原有方法进行改进，此时有两种办法
 * 修改原有方法来适应，这样就违反了“对扩展开放，对修改关闭”的原则
 * 采用代理类调用原有的方法，且对产生的结果进行控制，这就是代理模式
 * 
 * 使用代理模式，可以将功能划分的更加清晰，有助于后期维护
 */

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		
		source.method();
		
		after();

	}

	private void after() {

		System.out.println("after proxy!");
	}

	private void before() {

		System.out.println("before proxy!");
	}

}
