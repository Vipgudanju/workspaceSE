package user_js;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.DataSource;

public class userDao_js {

	private DataSource  dataSource;
	public userDao_js() throws Exception{
		dataSource = new DataSource();
	}
	
	public int insert(user_js newUser) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(userSQL_js.MEMBER_INSERT);
		pstmt.setString(1, newUser.getUser_id());
		pstmt.setString(2, newUser.getUser_pw());
		pstmt.setString(3, newUser.getUser_name());
		pstmt.setString(4, newUser.getUser_phone());
		pstmt.setString(5, newUser.getUser_address());
		pstmt.setString(6, newUser.getUser_email());
		
		int insertRowCount = pstmt.executeUpdate();
		return insertRowCount;
	}
	
	public int update(user_js updateUser) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(userSQL_js.MEMBER_UPDATE);
		pstmt.setString(1, updateUser.getUser_pw());
		pstmt.setString(2, updateUser.getUser_name());
		pstmt.setString(3, updateUser.getUser_phone());
		pstmt.setString(4, updateUser.getUser_address());
		pstmt.setString(5, updateUser.getUser_email());
		pstmt.setString(6, updateUser.getUser_id());
		
		int updateRowCount = pstmt.executeUpdate();
		return updateRowCount;
	}
	
	public int delete(String user_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(userSQL_js.MEMBER_DELETE);
		pstmt.setString(1, user_id);
		
		int deleteRowCount = pstmt.executeUpdate();
		return deleteRowCount;
	}
	
	public user_js findByPrimaryKey(String user_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(userSQL_js.MEMBER_SELECT_BY_ID);
		pstmt.setString(1, user_id);
		ResultSet rs = pstmt.executeQuery();
		
		user_js finduser_js = null;
		if(rs.next()) {
			finduser_js = new user_js (
					rs.getString("user.id"),
					rs.getString("user_pw"),
					rs.getString("user_name"),
					rs.getString("user_phone"),
					rs.getString("user_address"),
					rs.getString("user_email"));
		}
		return finduser_js;
	}
	
	public ArrayList<user_js> findAll() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(userSQL_js.MEMBER_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<user_js> userList = new ArrayList<user_js>();
		while(rs.next()) {
			userList.add(new user_js (
					rs.getString("user.id"),
					rs.getString("user_pw"),
					rs.getString("user_name"),
					rs.getString("user_phone"),
					rs.getString("user_address"),
					rs.getString("user_email"))
					);
		}
		return userList;
	}
	
	
}
