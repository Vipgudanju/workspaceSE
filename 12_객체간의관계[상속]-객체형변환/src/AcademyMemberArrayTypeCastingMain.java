// 2022-11-24

public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		/*
		AcademyMember[] members = new AcademyMember[7];
		members[0] =  new Academy
		*/
		
		AcademyMember[] members = {
			new AcademyStudent(1, "이승엽", "JAVA"),
			new AcademyStudent(2, "심수창", "DESIGN"),
			new AcademyStudent(3, "장원삼", "ANDROID"),
			new AcademyGangsa(4, "오주원", "ANDROID"),
			new AcademyGangsa(5, "이대은", "JAVA"),
			new AcademyStaff(6, "송승준", "ACCOUNTING"),
			new AcademyStaff(7, "정근우", "MARKETING")
		};
		
		/* ############################################################# */
		AcademyMember[] receiveMembers = members;
		
		System.out.println(" ------ AcademyMember 전체출력 ------");
		for(int i = 0; i < receiveMembers.length; i++) {
			/*
			 * AcademyStudent, AcademyGangsa, AcademyStaff에서 재정의된 print메소드 호출
			 */
			receiveMembers[i].print();
		}
		
		System.out.println(" --------- instanceof ------------");
		/*
		 * 연산자 --> instanceof
		 *   - 형태     : 참조변수 instanceof 클래스이름
		 *   - 연산결과 : true or false
		 *   - ex> boolean b = receiveMembers[0] instanceof  AcademyStudent;
		 */
		
		AcademyMember am = new AcademyStudent(90, "정성훈", "정보처리");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan =  tempStudent.getBan();
			System.out.println("학생반:" +tempBan);
		}
		
		System.out.println(" ----------------- AcademyMember 배열에 있는 객체들 중에서 AcademyStudent 객체들만 출력 --------------------");
		for(int i = 0; i < receiveMembers.length; i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyStudent tempStudent = (AcademyStudent)receiveMembers[i];
				System.out.println("학생반:" + tempStudent.getBan());
			}
		}
			
		
		
		
	}

}
