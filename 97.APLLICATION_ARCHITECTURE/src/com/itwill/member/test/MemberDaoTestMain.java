package com.itwill.member.test;

import java.util.ArrayList;
import java.util.List;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		//System.out.println("0.delete   --> ");
		//System.out.println(">>>" +memberDao.delete());
		
		System.out.println("1.insert   --> ");
		Member insertMember=new Member("dddd","dddd","이승엽","대구시 수성구", 32,"F",null);	
		
		System.out.println(">>>" + memberDao.insert(insertMember));
		
		//System.out.println("2.update   --> ");
		
		//System.out.println("3.selectById-> ");
		//Member findMember = memberDao.findByPrimaryKey("bbbb");
		//System.out.println(findMember);
		
		System.out.println("4.selectAll--> ");
		List memberList = new ArrayList();
		memberList = memberDao.findAll();
		System.out.println(memberList);
	}

}
