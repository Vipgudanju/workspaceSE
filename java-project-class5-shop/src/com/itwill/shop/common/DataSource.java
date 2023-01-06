package com.itwill.shop.common;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 데이타베이스 설정정보를 사용해서
 Connection객체를 생성하고,해지하는 역할을하는 클래스
 (Dao객체들이 사용하는객체)
 */
public class DataSource {
	
	/*****************데이타베이스접속정보***********기존 작성/ 
	//private String driverClass="oracle.jdbc.OracleDriver";
	//private String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	//private String user="jdeveloper11";
	//private String password="jdeveloper11";
	/***********************************************/
	
	/*****************데이타베이스접속정보를 저장할 필드***********/
	private String driverClass;
	private String url;
	private String user;
	private String password;
	/***********************************************/
	public DataSource() throws Exception{
		/************ jdbc.properties을 읽어서 데이터베이스 접속 정보를 필드에 저장 *********/
		Properties properties=new Properties();
		InputStream propertiesInput = DataSource.class.getResourceAsStream("/jdbc.properties");
		properties.load(propertiesInput);
		this.driverClass=properties.getProperty("driverClass");
		this.url=properties.getProperty("url");
		this.user=properties.getProperty("user");
		this.password=properties.getProperty("password");
		
	}
	
	/*
	 * Connection 객체를 생성해서 반환하는메쏘드
	 */
	public Connection getConnection() throws Exception{
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	/*
	 * Connection 객체를 close하는 메쏘드
	 */
	public void close(Connection con) throws Exception{
		con.close();
	}
	
	
}