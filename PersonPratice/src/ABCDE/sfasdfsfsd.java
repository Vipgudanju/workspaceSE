package ABCDE;

public class sfasdfsfsd {

	/*
	 public class GuestDao {
	
	public int insert(Guest gs) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper16";
		String password = "jdeveloper16";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String insert = "insert into guest values(guest_guest_no_seq.nextval, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(insert);
		
		pstmt.setString(1, gs.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(gs.getGuest_date().getTime()));
		pstmt.setString(3, gs.getGuest_email());
		pstmt.setString(4, gs.getGuest_homepage());
		pstmt.setString(5, gs.getGuest_title());
		pstmt.setString(6, gs.getGuest_content());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	 */
	
	/*
	 String insertSQL = "insert into guest values(guest_guest_no_seq.nextval,?,?,?,?,?,?)";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		
		String guest_name = guest.getGuest_name();
		Date guest_date = new Date();
		String guest_email = guest.getGuest_email();
		String guest_homepage = guest.getGuest_homepage();
		String guest_title = guest.getGuest_title();
		String guest_content = guest.getGuest_content();
		
		pstmt.setString(1, guest_name);
		pstmt.setDate(2,new java.sql.Date(guest_date.getTime()));
		pstmt.setString(3, guest_email);
		pstmt.setString(4, guest_homepage);
		pstmt.setString(5, guest_title);
		pstmt.setString(6, guest_content);
		
		int rowCount = pstmt.executeUpdate();
		
		System.out.println("insert " + rowCount + "행 추가");
		
		pstmt.close();
		con.close();
		
		return rowCount;
	 */
	
	
}
