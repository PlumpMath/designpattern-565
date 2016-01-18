package org.mj.haifeng.designpattern.facade;

/**
 * @author haifeng
 *
 * 这是一个外关模式类，将一些类与类之间的关系放在了这个类中，
 * 降低了那些本身有依赖关系的类与类之间的耦合度
 * 
 * 如果没有computer类，那么CPU、Memory、Disk它们之间将会相互持有实例，产生关系，这样会造成严重的依赖，修改
 * 一个类，可能会带来其他类的修改
 */
public class Computer {

	private CPU cpu;
	
	private Memory memory;
	
	private Disk disk;
	
	public Computer() {
		
		cpu = new CPU();
		
		memory = new Memory();
		
		disk = new Disk();
	}
	
	public void startup() {
		System.out.println("start the computer!");
		
		cpu.startup();
		
		memory.startup();
		
		disk.startup();
		
		System.out.println("start computer finished!");
	}
	
	public void shutdown() {
		System.out.println("begin to close the computer!");
		
		cpu.shutdown();
		
		memory.shutdown();
		
		disk.shutdown();
		
		System.out.println("computer closed!");
		
	}
}
