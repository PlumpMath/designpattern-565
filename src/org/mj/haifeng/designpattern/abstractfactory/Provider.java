package org.mj.haifeng.designpattern.abstractfactory;

import org.mj.haifeng.designpattern.factory.Sender;

/**
 * @author haifeng
 *
 * 抽象工厂的好处是，当需要扩展新的业务时，不需要修改原有的工厂类，只需要添加
 * 相应的一个工厂类，实现Provider接口就可以了
 * 
 * 这时候produce方法自然就不能设置成静态方法了，因为它是要被子类重写的
 */
public interface Provider {
	
	public Sender produce();
	

}
