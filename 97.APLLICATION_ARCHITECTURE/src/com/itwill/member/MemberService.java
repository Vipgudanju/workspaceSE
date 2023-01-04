package com.itwill.member;

import java.util.List;

public class MemberService {
	private MemberDao memberDao;
	
	public MemberService() throws Exception{
		memberDao = new MemberDao();
	}
	
	/*
	 * 회원가입
	 *  - 아이디가 중복되는 경우에는 메세지를 띄운다.
	 */
	public boolean addMember(Member member) throws Exception{
		boolean isSuccess = false;
		/*
		 * 아이디 존재여부 체크
		 *  - 존재 하면 메세지
		 *  - 존재 안하면 가입
		 */
		if(memberDao.findByPrimaryKey(member.getM_id()) == null) {
			int rowCount = memberDao.insert(member);
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
		return isSuccess;
	}
	
	/*
	 * 회원 로그인
	 */
	public int login(String id, String password) throws Exception{
		/*
		 * 0: 성공
		 * 1: 아이디 존재 안함
		 * 2: 패스워드 불일치
		 */
		int loginResult = -9999;
		Member findMember = memberDao.findByPrimaryKey(id);
		if(findMember == null) {
			// 아이디 존재 안함
			loginResult = 1;
		} else {
			// 아이디 존재함
			if(password.equals(findMember.getM_password())) {
				//패쓰워드일치
				loginResult=0;
			}else {
				//패쓰워드불일치
				loginResult=2;
			}
		}
		return loginResult;
	}
	
	/*
	 * 회원아이디 중복체크
	 */
	public  boolean isDuplicateId(String m_id)throws Exception {
		Member findMember=memberDao.findByPrimaryKey(m_id);
		if(findMember==null) {
			return false;
		}else {
			return true;
		}
	}
	
	/*
	 * 회원상세 보기
	 */
	public Member memberDetail(String m_id) throws Exception{
		return memberDao.findByPrimaryKey(m_id);
	}
	
	
	/*
	 * 회원아이디로 수정
	 */
	public int memberUpdate(Member member) throws Exception {
		return memberDao.update(member);
	}
	
	/*
	 * << admin >>
	 * 회원아이디로 삭제
	 */
	public int memberDelete(String m_id) throws Exception{
		return memberDao.delete(m_id);
	}
	/*
	 * 회원전체 리스트
	 */
	public List<Member> memberList() throws Exception{
		return  memberDao.findAll();
		
	}
	
	/*
	 * 회원전체검색
	 * 회원이름으로검색
	 * 회원주소로검색
	 * 회원나이로검색
	 * 회원결혼여부로검색
	 * 회원가입일로검색
	 */
	
	
	
}
