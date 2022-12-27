package dao.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() {

	}

	public void insert(Member newMember) throws Exception {
		
		String insertSQL = "insert into address values(address_no_seq.nextval,'"
														+newMember.getM_id()+"','"
														+newMember.getM_password()+"','"
														+newMember.getM_name()+"','"
														+newMember.getM_address()+"','"
														+newMember.getM_age()+"','"
														+newMember.getM_married()+"','"
														+newMember.getM_reDate()+"')";
		
		
	}

	public void update() throws Exception {

	}

	public void delete() throws Exception {

		
	}

	public void findByPrimaryKey() throws Exception {

	}

	public void findAll() throws Exception {

	}
}
