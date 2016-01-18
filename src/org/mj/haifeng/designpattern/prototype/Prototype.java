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
 * Cloneable�Ǹ��սӿڣ���������ⶨ��ʵ����ķ�������Object�е�Clone()��native��********
 * 
 * ǳ����
 * 
 * ���
 */
public class Prototype implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String string;
	
	private SerializableObject obj;
	
    /* ǳ����  */
	
	public Object clone() throws CloneNotSupportedException {
		
		Prototype proto = (Prototype)super.clone();
		
		return proto;
	}
	
	/* ��� : ����������ʽ���뵱ǰ����Ķ��������룬��д�����������ݶ�Ӧ�Ķ���*/
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
