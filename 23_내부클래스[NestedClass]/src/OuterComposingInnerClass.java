public class OuterComposingInnerClass {
	public int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterComposingInnerClass.outer_member_method()");
	}
	/************Outer클래스에서 Inner클래스 사용*********/
	public void outer_inner_class_use() {
		/*
		 * local변수
		 */
		int local_variable=100;
		/******************** member inner class[CASE]
		ParentFirstConcreteClass childFirstConcreateClass=new ChildFirstConcreateClass();
		childFirstConcreateClass.local_inner_outer_access();
		*/
		ParentFirstConcreateClass childFirstConcreateClass = new ParentFirstConcreateClass(){
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentFirstConcreteClass를 상속받는 "
						+ "ChildFirstConcreateClass에서 재정의한 local_inner_outer_access()");
						/* 이름없는 로컬 내부클래스에서 재정의한 local_inner_outer_access()↑ */
					}
				};
		childFirstConcreateClass.local_inner_outer_access();	
		
		ParentSecondAbstractClass childAbstractClass = new ParentSecondAbstractClass() {
			
			@Override
			public void local_inner_outer_access() {
				 System.out.println("ParentSecondAbstractClass를 이름없는 클래스에서 재정의한 local_inner_outer_access()");
				
			}
		};
		
		childAbstractClass.local_inner_outer_access();
		
		ParentThirdInterface childThirdInterface = new ParentThirdInterface() {
			
			@Override
			public void loca_inner_outer_access() {
				System.out.println("ParentThirdInterface를 상속받은(구현한) 이름없는 클래스에서 재정의한 local_inner_outer_access()");
				
			}
		};
		childThirdInterface.loca_inner_outer_access();
		
		Object oc = new Object() {
			@Override
			public String toString() {
				return "난 재정의된 ToString";
			}
		};
		System.out.println(oc);
		
	} // end method
	
	/*
	 << 특정클래스의 메소드를 재정의해야할 때 >>
	 	1. local위치 에서 이름이 존재하지 않는 클래스를 정의
	 	2. local위치(?)에서 객체를 생성
	 */
	
	
	/*****************************************
	 ParentFirstConcreteClass를 상속받고 
	 public void local_inner_outer_access() 메쏘드를 재정의하는 Inner클래스 
	*/
	/******************************** member inner class[CASE] ****************************
	public class ChildFirstConcreateClass extends ParentFirstConcreteClass{
					@Override
					public void local_inner_outer_access() {
						System.out.println("ParentFirstConcreteClass를 상속받는 "
								+ "ChildFirstConcreateClass에서 재정의한 local_inner_outer_access()");
					}
	}
	*/
	public static void main(String[] args) {
		OuterComposingInnerClass outerComposingInnerClass=new OuterComposingInnerClass();
		outerComposingInnerClass.outer_inner_class_use();
	}
	
}
