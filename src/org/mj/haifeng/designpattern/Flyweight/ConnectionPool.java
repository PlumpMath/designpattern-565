package org.mj.haifeng.designpattern.Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import javax.security.auth.kerberos.KerberosKey;

/**
 * @author haifeng
 * ��ҪĿ����ʵ�ֶ���Ĺ����������
 * ��ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ�����ͨ���빤��ģʽһ��ʹ��
 */
public class ConnectionPool {
	
	private Vector<Connection> pool;
	
	/* �������� */
	private String url = "jdbc:mysql://localhost:3306/test";
	
	private String username = "root";
	
	private String password = "root";
	
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	
	private int poolSize = 100;
	
	private static Connection instance = null;
	
	Connection conn = null;                      //default
	
	
	private ConnectionPool() {            //���췽��˽��
		
		pool = new Vector<Connection>(poolSize);
		
		for(int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				conn = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pool.add(conn);
		}
	}
	
	/**
	 * ���ӷ��ص����ӳ�
	 */
	public synchronized void release() {

		pool.add(conn);
          		
	}
	
	
	
	/**
	 * @return
	 * �������ӳ��е�һ�����ݿ�����
	 */
	public synchronized Connection getConnection() {
		
		if(pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			
			return conn;
		} else {
			return null;
		}
	}

}
