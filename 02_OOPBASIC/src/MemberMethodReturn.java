// 2022-11-16

public class MemberMethodReturn {
	
	/*
	 * 멤버필드
	 *  - 멤버필드 선언시 값을 대입할 수 있다.
	 */
	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	
	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}
	
	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	/*
	 * getter method
	 */
	int getMemebrField1() {
		return this.memberField1;
	}
	
	int getMemebrField2() {
		return this.memberField2;
	}
	
	int getMemebrField3() {
		return this.memberField3;
	}
	
	/*
	 * 멤버메서드
	 */
	int method1() {
		System.out.println("\t -- int method1()-- 실행");
		int result = 145 + 245;
		System.out.println("\t -- int method1()-- 실행종료 후 int 데이타 반환--");
		/*
		 * return <<호출한 클래스(객체)에게 반환할값(변수, 리터럴, 연산의 결과)>>
		 *   - 호출한 곳으로 실행흐름반환
		 *   - 호출한 곳으로 데이타반환
		 *   - 반환할 데이타가 없는 경우에는(void) return문 생략이 가능하다.
		 *   - 반환할 데이타가 있는 경우에는(int, ...) return문 반드시 기술해야 한다.
		 */
		return result;
	}
	
	boolean method2() {
		System.out.println("\t--- boolean method2()실행 ----");
		boolean isMarried = false;
		System.out.println("\t--- boolean method2() 종료후 boolean 데이터 반환 ----");
		return isMarried;
	}
	
	/*
	 * 두 개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메서드
	 */
	int add(int a,int b) {
		System.out.println(
				"---int add(int a,int b)---실행");
		int result=a+b;
		System.out.println(
				"---int add(int a,int b)---종료후 int 데이타반환");
		return result;
	}

	String hello(String name) {
		System.out.println(
				"\t---String hello(String name)실행---");
		String msg="";
		msg=name+"님 안녕하세요!";
		System.out.println(
				"\t---String hello(String name)종료후 String(문자열)데이타 반환---");
		return msg;
	}
	
	
	
	
	
}
