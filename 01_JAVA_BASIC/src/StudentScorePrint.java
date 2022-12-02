
public class StudentScorePrint {

	public static void main(String[] args) {
		/*(1)
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int student_num1, student_num2;
		String student_nam1, student_nam2 ;
		int  kor1, kor2, eng1, eng2, math1, math2, total1, total2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;
		
		
		
		/*(2)
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		student_num1 = 1;
		student_num2 = 2;
		student_nam1 = "이재용";
		student_nam2 = "팀쿡";
		kor1 = 42;
		kor2 = 45;
		eng1 = 56;
		eng2 = 53;
		math1 =78 ;
		math2 = 76;
		
		
		
		/*(3)
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		/*
		kor1 = 42; 
		kor2 = 45;
		eng1 = 56;
		eng2 = 53;
		math1 =78 ;
		math2 = 76;
		*/
		
		if(kor1 < 0 || kor1 > 100) {
			System.out.println(kor1 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		if(kor2 < 0 || kor2 > 100) {
			System.out.println(kor2 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		if(eng1 < 0 || eng1 > 100) {
			System.out.println(eng1 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		if(eng2 < 0 || eng2 > 100) {
			System.out.println(eng2 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		if(math1 < 0 || math1 > 100) {
			System.out.println(math1 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		if(math2 < 0 || math2 > 100) {
			System.out.println(math2 + "은 유효한 점수가 아닙니다.");
			return;
		}
		
		
		/*
		if(kor1 < 0 || kor1 > 100) {
			System.out.println(kor1 + "은 유효한 점수가 아닙니다.");
			return;
		}else {
			if(eng1 < 0 || eng1 > 100) {
				System.out.println(eng1 + "은 유효한 점수가 아닙니다.");
				return;
		}else {
			if(eng2 < 0 || eng2 > 100) {
				System.out.println(eng2 + "은 유효한 점수가 아닙니다.");
				return;
		}else {
			if(math1 < 0 || math1 > 100) {
				System.out.println(math1 + "은 유효한 점수가 아닙니다.");
				return;
		} if(math2 < 0 || math2 > 100) {
			System.out.println(math2 + "은 유효한 점수가 아닙니다.");
			return;
		*/
		
		
		
		
		
		
		/*(4)
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;
		avg1 = total1/3 ;
		avg2 = total2/3 ;
		
		grade1 = 'X';
		
		if(kor1 >= 90 && kor1 <= 100) {
			grade1 = 'A';
		}else if(kor1 >= 80 && kor1 <= 89) {
			grade1 = 'B';
		}else if(kor1 >= 70 && kor1 <= 79) {
			grade1 = 'C';
		}else if(kor1 >= 60 && kor1 <= 69) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		
		
		if(eng1 >= 90 && eng1 <= 100) {
			grade1 = 'A';
		}else if(eng1 >= 80 && eng1 <= 89) {
			grade1 = 'B';
		}else if(eng1 >= 70 && eng1 <= 79) {
			grade1 = 'C';
		}else if(eng1 >= 60 && eng1 <= 69) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		
		
		if(math1 >= 90 && math1 <= 100) {
			grade1 = 'A';
		}else if(math1 >= 80 && math1 <= 89) {
			grade1 = 'B';
		}else if(math1 >= 70 && math1 <= 79) {
			grade1 = 'C';
		}else if(math1 >= 60 && math1 <= 69) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		
		
		grade2 = 'Y';
		if(kor2 >= 90 && kor2 <= 100) {
			grade2 = 'A';
		}else if(kor2 >= 80 && kor2 <= 89) {
			grade2 = 'B';
		}else if(kor2 >= 70 && kor2 <= 79) {
			grade2 = 'C';
		}else if(kor2 >= 60 && kor2 <= 69) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		
		grade2 = 'Y';
		if(eng2 >= 90 && eng2 <= 100) {
			grade2 = 'A';
		}else if(eng2 >= 80 && eng2 <= 89) {
			grade2 = 'B';
		}else if(eng2 >= 70 && eng2 <= 79) {
			grade2 = 'C';
		}else if(eng2 >= 60 && eng2 <= 69) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		
		grade2 = 'Y';
		if(math2 >= 90 && math2 <= 100) {
			grade2 = 'A';
		}else if(math2 >= 80 && math2 <= 89) {
			grade2 = 'B';
		}else if(math2 >= 70 && math2 <= 79) {
			grade2 = 'C';
		}else if(math2 >= 60 && math2 <= 69) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		
		rank1 = 0;
		rank2 = 0;
		
		/*(5)
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		/*
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",1,"김경호", 42,56,78,334,34.56,'A',3 );
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",2,"김경수", 42,56,78,334,56.89,'A',3 );
		*/
		
		
		
		
		
		
		
		
	}

}
