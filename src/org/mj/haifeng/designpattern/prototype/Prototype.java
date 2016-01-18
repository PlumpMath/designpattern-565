package org.mj.haifeng.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author haifeng
 *
 * Cloneable是个空接口，你可以任意定义实现类的方法名，Object中的Clone()是native的********
 * 
 * 浅复制
 * 
 * 深复制
 */
public class Prototype implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String string;
	
	private SerializableObject obj;
	
    /* 浅复制  */
	
	public Object clone() throws CloneNotSupportedException {
		
		Prototype proto = (Prototype)super.clone();
		
		return proto;
	}
	
	/* 深复制 : 采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象*/
	public Object deepClone() throws IOException, ClassNotFoundException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
		
	}
	
	public String getString() {
		return string;
		
	}
	
	public void setString(String string) {
		this.string = string;
	}
	
	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	class SerializableObject implements Serializable {
		private static final long serialVersionUID = 1L;
	}

}
