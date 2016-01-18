package org.mj.haifeng.designpattern.Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import javax.security.auth.kerberos.KerberosKey;

/**
 * @author haifeng
 * 主要目的是实现对象的共享，即共享池
 * 当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用
 */
public class ConnectionPool {
	
	private Vector<Connection> pool;
	
	/* 公有属性 */
	private String url = "jdbc:mysql://localhost:3306/test";
	
	private String username = "root";
	
	private String password = "root";
	
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	
	private int poolSize = 100;
	
	private static Connection instance = null;
	
	Connection conn = null;                      //default
	
	
	private ConnectionPool() {            //构造方法私有
		
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
	 * 连接返回到连接池
	 */
	public synchronized void release() {

		pool.add(conn);
          		
	}
	
	
	
	/**
	 * @return
	 * 返回连接池中的一个数据库连接
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
