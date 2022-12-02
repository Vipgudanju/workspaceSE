package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		
		/*
		 * - 학생객체 생성(3명)
		 */
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		
		/*
		 * 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메소드 호출(3명)
		 */
		stud1.memberdata(1, "이승엽", 88,58, 56);
		stud2.memberdata(2, "장원삼", 68,95, 66);
		stud3.memberdata(3, "오주원", 58,75, 86);
	
		/*
		 * 학생총점계산 메소드 호출(3명)
		 * 학생평균계산 메소드 호출(3명)
		 * 학생평점계산 메소드 호출(3명)
		 */
		
		stud1.total();
		stud2.total();
		stud3.total();
		
		stud1.average();
		stud2.average();
		stud3.average();
		
		stud1.grad();
		stud2.grad();
		stud3.grad();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		stud1.headerPrint();
		stud1.print();
		stud2.print();
		stud3.print();
		stud3.endPrint();
		
		/*
		 * 
		 * 학번  이름  국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
  			1  이승엽   88   58   56  202 67.3   D    0
  			2  장원삼   68   95   66  229 76.3   C    0
  			3  오주원   58   75   86  219 73.0   C    0
		-----------------------------------------------
		 */
		
		
	}

}
