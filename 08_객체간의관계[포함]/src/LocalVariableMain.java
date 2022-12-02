// 2022-11-21

public class LocalVariableMain {

	public static void main(String[] args) {
		
		/*
		 * 지역변수(local variable)
		 *   - 메소드블록안에서 선언된 변수(매개변수)
		 * 멤버변수(필드)
		 *   - 클래스 블록안에서 선언된 변수
		 */
		
		/*
		 * local 변수(기본형 변수)
		 */
		int a  = 9;
		int b = 10;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		/*
		 * local 변수초기화
		 *   - 모든변수는 반드시 초기화하여야 사용할 수 있다.
		 */
		/**************************************
		<< 1.The local variable tot may not have been initialized >>
		int tot;
		System.out.println(tot);
		**************************************/
		
		/************************************
		<< 2.The local variable tot may not have been initialized >>
		int tot;
		boolean condition = true;
		if(condition) {
			tot = 0;
		}else {
			tot= 1;
		}
		System.out.println("tot=" + tot);
		************************************/
		
		/************************************
		<< 3.The local variable tot may not have been initialized >>
		int tot;
		tot = tot + 1;
		************************************/
		
		int tot1 ;
		tot1 = 0;
		System.out.println("tot1=" + tot1);
		
		int tot2;
		tot2 = 2;
		boolean condition = true;
		if(condition) {
			tot2= 2;
		}
		System.out.println("tot2=" + tot2);
		
		int tot3;
		tot3 = 0;
		tot3 = tot3 + 3;
		System.out.println("tot3 =" + tot3);
		
		System.out.println(" ======================================== ");
		
		/*
		 * local변수 (참조형변수)
		 */
		
		/***************************************
		<< The local variable member1 may not have been initialized >>
		member1.print();
		***************************************/
		
		DuoMember member1;
		member1 = new DuoMember(1, "오주원");
		member1.print();
		
		DuoMember member2;   // <- 로컬변수
		
		boolean condition2 = true;
		if(condition2) {
			member2 = new DuoMember(2, "이승엽");
		}else {
			member2 = new DuoMember(2, "장원삼");
		}
		member2.print();
		
		/*
		 * 참조변수 초기화시 기본값
		 *   - null(참조변수 리터럴)
		 *   -> 주소없다의 주소값
		 */
		DuoMember member3 = null;
		if(member3 == null) {
			member3 = new DuoMember(3, "심수창");
		}
		member3.print();
		
		
		return;
	}

}
