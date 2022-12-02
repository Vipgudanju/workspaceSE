
public class AcademyMemberMain {

	public static void main(String[] args) {
		
		/******************* 존재하지 않는 객체생성 *****************
		AcademyStudent st1 = new AcademyStudent(1, "이승엽", "LIMUX");
		AcademyStudent st2 = new AcademyStudent(2, "장원삼", "JAVA");
		*************************************************************/
		System.out.println();
		
		AcademyStudent st1 = new AcademyStudent(1, "이승엽", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "장원삼", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "오주원", "C++");
		AcademyGangsa gs2 = new AcademyGangsa(4, "송승준", "C+");
		
		AcademyStaff sf1 = new AcademyStaff(5, "심수창", "파이썬");
		AcademyStaff sf2 = new AcademyStaff(6, "이대은", "리엑트");
		
		
		System.out.println("---------------- Student ------------------");
		/********** 호출되면 안되는 메소드 호출 *************
		  st1.print();
		 ***************************************************/
		
		st1.sutdentPrint();
		st2.sutdentPrint();
		
		System.out.println("---------------- Gangsa ------------------");
		
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		
		
		System.out.println("------------ Staff -------------------------");
		
		sf1.stafPrint();
		sf2.stafPrint();

	}

}
