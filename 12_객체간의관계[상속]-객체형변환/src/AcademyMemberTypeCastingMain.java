// 2022-11-24

public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		  public class AcademyStudent extends AcademyMember
		  public class AcademyGangsa extends AcademyMember
		  public class AcademyStaff extends AcademyMember
		  
		  AcademyMember의 자식타입객체(AcademyStudent, AcademyGangsa, AcademyStaff)들은
		  AcademyMember 타입변수에 대입가능
		 */
		
		AcademyStudent st1 = new AcademyStudent(1, "장원영", "ANDROID");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "안유진", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "류주현", "OFFICE");
		
		AcademyMember m4 = new AcademyGangsa(4,"윤보미", "DB");
		AcademyMember m5 = new AcademyGangsa(5,"박초롱", "C++");
		
		AcademyMember m6 = new AcademyStaff(6, "오하영", "리엑트");
		AcademyMember m7 = new AcademyStaff(7, "정은지", "LINUX");
		
		/***** AcademyMember에 정의되지 않은 메소드 호출 불가능 **************
		String ban = m1.getBan();
		**********************************************************************/
		/****AcademyMember에정의된 메쏘드중 재정의된메쏘드호출가능****
		 - AcademyMember타입에 정의된 print 메쏘드를 호출하면
		 - AcademyMember의 자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)의
		  	재정의된 print메쏘드가호출된다.
		*/
		m1.print();
		
		System.out.println("------------ AcademyMember들 전체출력---------------");
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		

	}

}
