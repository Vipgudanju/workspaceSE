
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		
		
		students[0] = new AcademyStudent(1, "장원영", "JAVA");
		students[1] = new AcademyStudent(2, "안유진", "ANDROID");
		students[2] = new AcademyStudent(3, "리즈", "IOS");
		
		gangsas[0] = new AcademyGangsa(3, "허윤진", "웹디자인");
		gangsas[1] = new AcademyGangsa(4, "오하영", "오피스");
		
		staffs[0] = new AcademyStaff(5, "윤보미", "홍보부");
		staffs[1] = new AcademyStaff(6, "박초롱", "경영지원");
		
		System.out.println(" -----------------  AcademyMember 전체출력 --------------------");
		System.out.println("----------------------- Student------------------------------");
		for(int i = 0; i <students.length; i++) {
			students[i].print();
		}
		
		System.out.println("----------------------- Gangsa------------------------------");
		for(AcademyGangsa gangsa:gangsas) {
			gangsa.print();
		}
		System.out.println("----------------------- Staff------------------------------");
		for(AcademyStaff staff:staffs) {
			staff.print();
		}
		System.out.println(" ------------------ -----------------------------------------");

	}

}
