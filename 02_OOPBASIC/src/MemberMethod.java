// 2022-11-15

public class MemberMethod {

	int member1;
	
	void method1(){	// <- 실행 블록
		System.out.println("\t------void method1()실행시작------");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t------void method1()실행 끝------");
		/*
		 * << return >>
		  - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다.
		  - 실행흐름을 반환하는 문장이 return문이다.
		  - return 문을 만나면 실행흐름이 호출한곳으로 반환된다.
		  - return type이 void 인경우에는 생략이 가능하다.
		  - return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		return;
	}
	
	void method2() {
		System.out.println("\t ====== void method2() ====== start");
		System.out.println("\t method2 stmt1");
		System.out.println("\t method2 stmt2");
		System.out.println("\t ====== void method2() ====== end");
		return;
	}
	/*************** 매개변수가 있는 메서드 정의 ********************/
	
	void method3(int count) {		// 매개변수
		System.out.println("\t ==== void method3(int count) ==== 실행");
		int localVar = 111;
		System.out.println("\t method3 메서드블록 안에서 선언된 변수" + localVar);
		for(int i = 0; i < count; i++) {
		System.out.println("\t void method3(int count)실행: 파라메타(매개변수) count값->"+count);
		}
		System.out.println("\t ==== void method3(int count) ==== 실행 종료후 반환");
		return;
	}
	
	public void method4(String msg, int count) {
		System.out.println("\t void method4(String msg,int count)- 실행");
		for(int i = 0; i <count; i++) {
			System.out.println("\t\t" +msg);
		}
		System.out.println("\t void method4(String msg,int count)- 실행 종료");
		return;
	}
	
	public void method5(String abc, String def, int count) {
		System.out.println("\t void method4(String abc, String def, int count) - 실행");
		for(int i = 0; i < count; i++) {
			System.out.println("\t\t\t" +abc+def);
			//System.out.printf("$s님 %s !\n", abc, def);
		}
		System.out.println("\t void method4(String abc, String def, count) -실행 종료");
	}
	
	
}
