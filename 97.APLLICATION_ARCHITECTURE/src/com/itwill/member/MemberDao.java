package com.itwill.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
		dataSource=new DataSource();
	}

	public void insert(Member member) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_INSERT);
		
		
	}

	public void update(Member member) throws Exception {
		
	}

	public void delete() throws Exception {

	}

	public void findByPrimaryKey() throws Exception {

	}

	public void findAll() throws Exception {

	}
}
