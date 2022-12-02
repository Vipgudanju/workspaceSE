// 2022-11-15


public class MemberMethodMain {
	
	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mn1 = new MemberMethod();
		/*
		 * 멤버메서드 실행(호출)
		 * - 형식: 참조(주소)변수,메서드이름();
		 * - main 실행흐름을 mn1주소에 있는 객체의
		 *   method1이라는 이름의 메서드(실행코드 블록)로 보낸다.
		 */
		
		mn1.method1();
		System.out.println("main stmt2");
		mn1.method2();
		System.out.println("main stmt3");
		System.out.println("********매개변수가 있는 메서드호출********");
		mn1.method3(3);
		System.out.println("main stmt4");
		mn1.method3(5);
		System.out.println("main stmt5");
		mn1.method4("안녕하세요!!!" , 3);
		System.out.println("main stmt6");
		mn1.method4("수업 끝~~~~~", 10);
		System.out.println("main stmt7");
		
		/*
		 * Quiz :
		 * 이재용 님 누구세요!
		 * 이재용 님 누구세요!
		 * 이재용 님 누구세요!
		 */
		 mn1.method5("이재용","우주", 3);
		 System.out.println("main stmt8");
		 mn1.method5("팀쿡","사과", 3);
		
		System.out.println("main block end");
		return;
		
	}

}
