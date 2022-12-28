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
		
		String insertSQL = "insert into Guest(guest_no, guest_name, guest_date, guest_email, guest_homepage, guest_title, guest_content) values"
											 + "(" +newGuest.getGuest_no() +"',"
											 + "'" + newGuest.getGuest_name() +"',"
											 + "'" + newGuest.getGuest_date() +"',"
											 + "'" + newGuest.getGuest_email() +"',"
											 + "'" + newGuest.getGuest_homepage() +"',"
											 + "'" + newGuest.getGuest_title() +"',"
											 + "'" + newGuest.getGuest_content()+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		stmt.close();
		con.close();
		
	}
	
	
	public void update(Guest newGuest) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		
		
	}
	
	
	public void delete() throws Exception {
		
	}
	
	
	public void findByPrimaryKey() throws Exception {
		
	}
	
	
	public void findAll() throws Exception {
		
	}
	
}