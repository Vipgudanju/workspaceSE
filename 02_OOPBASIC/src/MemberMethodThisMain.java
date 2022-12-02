// 2022-11-15


public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mnt1 = new MemberMethodThis();
		/*
		mnt1.memberField1 = 1;
		mnt1.memberField2 = 'A';
		mnt1.memberField3 = 95.4;
		*/
		
		mnt1.setMemberField(1, 'A', 95.4);
		
		/*
		 * MemberMethodThis 객체 내용출력
		 */
		
		System.out.println(
							mnt1.memberField1 +"\t"+
							mnt1.memberField2 +"\t"+
							mnt1.memberField3);
		
		/*
		 * MemberMethodThis 객체 내용출력 메서드 호출
		 */
		
		System.out.println("main block --> mnt1 주소값:" +mnt1);
		mnt1.print();
		
		
		MemberMethodThis mnt2 = new MemberMethodThis();
		/*
		mnt2.memberField1 = 2;
		mnt2.memberField2 = 'F';
		mnt2.memberField3 = 90.45;
		mnt2.print();
		*/
		mnt2.setMemberField(2, 'F', 90.45);
		mnt2.print();
		
		
		
	}

}
