package com.itwill.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	private DataSource dataSource;
	
	public MemberDao() throws Exception{
		//dataSource=new DataSource();
		this.dataSource = new DataSource();
	}

	public int insert(Member member) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_INSERT);
		
		pstmt.setString(1, member.getM_id());
		pstmt.setString(2, member.getM_pssword());
		pstmt.setString(3, member.getM_name());
		pstmt.setString(4, member.getM_address());
		pstmt.setInt(5, member.getM_age());
		pstmt.setString(6, member.getM_married());
		pstmt.setDate(7, member.getM_regdate());
		
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public int update(Member member) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		
		pstmt.setString(1, member.getM_id());
		pstmt.setString(2, member.getM_pssword());
		pstmt.setString(3, member.getM_name());
		pstmt.setString(4, member.getM_address());
		pstmt.setInt(5, member.getM_age());
		pstmt.setString(6, member.getM_married());
		pstmt.setDate(7, member.getM_regdate());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public int delete() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_DELETE);
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public Member findByPrimaryKey(String str) throws Exception {
		Member findMember = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_ID);
		pstmt.setString(1, str);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findMember = new Member(rs.getString("m_id"),
									rs.getString("m_password"),
									rs.getString("m_name"),
									rs.getString("m_address"),
									rs.getInt("m_age"),
									rs.getString("m_married"),
									rs.getDate("m_regdate"));
		}
		
		return findMember;
	}

	public List<Member> findAll() throws Exception {
		List<Member> memberList = new ArrayList<Member>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SEKECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Member newMember  = new Member(rs.getString("m_id"),
					rs.getString("m_password"),
					rs.getString("m_name"),
					rs.getString("m_address"),
					rs.getInt("m_age"),
					rs.getString("m_married"),
					rs.getDate("m_regdate"));
					
				memberList.add(newMember);	
		}
		return memberList;
	}
}
