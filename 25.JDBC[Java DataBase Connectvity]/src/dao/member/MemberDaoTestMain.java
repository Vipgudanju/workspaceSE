package dao.member;

import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();

		System.out.println("0.delete   --> ");
		int rowCount = memberDao.delete("'cccc'");
		System.out.println(">>delete row count : " +rowCount);


		System.out.println("1.insert   --> ");
		Member newMember = new Member("dddd", "dddd", "윤보미", "경기도 구리시", 77, "F");
		rowCount = memberDao.insert(newMember);
		System.out.println(">>insert row count : " +rowCount);

		System.out.println("2.update   --> ");
		Member updateMember = new Member ("bbbb", "bbbb", "경기도", "구리시", 88, "M");
		rowCount = memberDao.update(updateMember);
		System.out.println(">>update row count : " +rowCount);
		
		System.out.println("3.selectById-> ");
		Member findMember = memberDao.findByPrimaryKey("'dddd'");
		if(findMember!=null) {
			System.out.println(findMember);
		} else {
			System.out.println("존재하는 Member 없습니다.");
		}

		System.out.println("4.selectAll--> ");

		List <Member> memberList = memberDao.findAll();
		System.out.println(memberList);


	}

}