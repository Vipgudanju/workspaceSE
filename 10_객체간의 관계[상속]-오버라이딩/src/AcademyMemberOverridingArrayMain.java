
public class AcademyMemberOverridingArrayMain {

	public static void main(String[] args) {
		
		/******************* 존재하지 않는 객체생성 *****************
		AcademyStudent st1 = new AcademyStudent(1, "이승엽", "LIMUX");
		AcademyStudent st2 = new AcademyStudent(2, "장원삼", "JAVA");
		*************************************************************/
		System.out.println();
		
		AcademyStudent st1 = new AcademyStudent(1, "장원영", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "윤보미", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "안유진", "C++");
		AcademyGangsa gs2 = new AcademyGangsa(4, "오하영", "DB");
		
		AcademyStaff sf1 = new AcademyStaff(5, "레이", "파이썬");
		AcademyStaff sf2 = new AcademyStaff(6, "박초롱", "리엑트");
		
		
		System.out.println("---------------- Student ------------------");
		/********** 호출되면 안되는 메소드 호출 *************
		  st1.print();
		 ***************************************************/
		
		st1.print();
		st2.print();
		
		System.out.println("---------------- Gangsa ------------------");
		
		gs1.print();
		gs2.print();
		
		
		System.out.println("------------ Staff -------------------------");
		
		sf1.print();
		sf2.print();
		

	}

}
