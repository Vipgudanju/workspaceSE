// 2022-12-09

public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field = 8888;
	/*
	 * 인스턴스 멤버메소드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.member_method()");
	}
	
	/*********************OuterClass에서 InnerClass객체 생성 사용**********************/
	public void outer_inner_class_use() {
		//OuterClass.InnerClass ic = new OuterClass.InnerClass(); <- OuterClass참조 생략가능
		InnerClass ic = new InnerClass();
		ic.inner_member_field = 121212;
		ic.inner_member_method();
		System.out.println(ic);
		System.out.println();
		
	}
	
	
	
	/*
	 * 인스턴스 멤버클래스(Nested class, Inner class)
	 *   - 작성이유: 내부클래스에서 외부클래스의 멤버접근을 손쉽게하기 위해서 작성
	 */
	public class InnerClass {
		public int inner_member_field = 3333;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/********************* 내부클래스에서 외부클래스의 멤버접근 *************************/
		
		public void inner_outer_member_access() {
			System.out.println(InnerClass.this);
			System.out.println(OuterClass.this);
			System.out.println(this);	// InnerClass 객체참조
			outer_member_field = 9999;
			outer_member_method();
			
		}
		
	}
	
	
	
}
