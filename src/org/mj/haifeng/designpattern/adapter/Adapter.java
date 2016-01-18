package org.mj.haifeng.designpattern.adapter;

/**
 * @author haifeng
 *
 * 这是类的适配器，通常有一个Source类，拥有一个方法，待匹配，一个目标接口
 * 通过adapt系那个Source的功能扩展到Targetable里
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");

	}

}
