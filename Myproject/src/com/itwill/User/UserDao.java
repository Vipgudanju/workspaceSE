package com.itwill.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.Common.DataSource;

public class UserDao {
	
	private DataSource dataSource;
	public UserDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int insert(User newUser) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1, newUser.getUser_id());
		pstmt.setString(2, newUser.getUser_pw());
		pstmt.setString(3, newUser.getUser_name());
		pstmt.setString(4, newUser.getUser_phone());
		pstmt.setString(5, newUser.getUser_address());
		pstmt.setString(6, newUser.getUser_email());
		
		int insertRowCount = pstmt.executeUpdate();
		return insertRowCount;
	}
	
	
	public int update(User updateUser) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_UPDATE);
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
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_DELETE);
		pstmt.setString(1, user_id);
		int deleteRowCount = pstmt.executeUpdate();
		return deleteRowCount;
	}
	
	
	public User findByPrimaryKey(String user_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1, user_id);
		ResultSet rs = pstmt.executeQuery();
		
		User findUser = null;
		if(rs.next()) {
			findUser = new User(
					rs.getString("user_id"),
					rs.getString("user_pw"),
					rs.getString("user_name"),
					rs.getString("user_phone"),
					rs.getString("user_address"),
					rs.getString("user_email"));
		}
		return findUser;
	}
	
	public ArrayList<User> findAll() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<User> userList = new ArrayList<User>();
		while(rs.next()) {
			userList.add(new User(
					rs.getString("user_id"),
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
