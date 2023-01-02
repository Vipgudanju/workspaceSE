package com.itwill.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.itwill.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	private DataSource dataSource;
	
	public GuestDao() throws Exception{
		dataSource = new DataSource();
	}
	public int insert(Guest guest) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = 
									con.prepareStatement(GuestSQL.GUEST_INSERT);
		/*
		 * 파라메타 세팅
		 */
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return 0;
	}
	
	public int delete(int guest_no) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = 
									con.prepareStatement(GuestSQL.GUEST_DELETE);
		/*
		 * 파라메타 세팅
		 */
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return 0;
	}
	
	public int update(Guest guest) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = 
									con.prepareStatement(GuestSQL.GUEST_UPDATE);
		/*
		 * 파라메타 세팅
		 */
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return 0;
	}
	
	public Guest findByPrimaryKey(int guest_no) throws Exception{
		return null;
	}
	
	public List<Guest> findAll() {
		return null;
	}
	
	public List<Guest> findByGuestName(String name) {
		return null;
	}
	
}
