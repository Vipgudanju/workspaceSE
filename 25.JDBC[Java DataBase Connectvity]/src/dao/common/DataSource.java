package dao.common;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 데이타베이스 설정정보를 사용해서
 Connection객체를 생성하고,해지하는 역할을하는 클래스
 (Dao객체들이 사용하는객체)
 */
public class DataSource {
	/*****************데이타베이스접속정보***********/
	private String driverClass="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user="jdeveloper11";
	private String password="jdeveloper11";
	/***********************************************/
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