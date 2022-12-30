package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	
	public void insert(Guest newGuest) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		
		
	}
	
	
	public void update(Guest newGuest) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper11";
		String password="jdeveloper11";
		
		
	}
	
	
	public void delete(Guest newGuest) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		
	}
	
	
	public void findByPrimaryKey() throws Exception {
		
	}
	
	
	public void findAll() throws Exception {
		
	}
	
}