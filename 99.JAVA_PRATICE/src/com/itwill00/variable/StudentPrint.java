package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		
			
			/*
			 * 성적관리에서 학생2명 데이타를 담을 변수선언
			 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
			 */
			
			int Student_Num1, Student_Num2 ; 									
			String Student_Name1, Student_Name2 ; 										
			int Kor1, Kor2, Eng1, Eng2, Math1, Math2,Total_Sum1, Total_Sum2 ;   
			double Avg_Num1, Avg_Num2; 											
			char Grade1, Grade2;												
			int Rank1, Rank2; 													
			
			
			/*
			 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
			 */
			
			Student_Num1 = 1;
			Student_Num2 = 2;
			Student_Name1 = "이재용";
			Student_Name2 = "팀쿡";
			Kor1 = 42;
			Kor2 = 45;
			Eng1 = 56;
			Eng2 = 53;
			Math1 = 78;
			Math2 = 76;
			
			
			
			/*
			 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
			 * 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
			 */
			
			Total_Sum1= Kor1 + Eng1+ Math1 ;
			Total_Sum2= Kor2 + Eng2 + Math2 ;
			Avg_Num1 = (double)Total_Sum1 /3 ;
			Avg_Num2 = (double)Total_Sum2 /3 ;
			Grade1 = 'F';
			Grade2 = 'F';
			Rank1 = 0;
			Rank2 = 0;
			
			
			/*
			- 출력포맷
	 		- 평균은 소수점이하 자리수를 잘라버리세요[or 반올림하세요].
	 		- 석차,평점은 구하지마세요
			*/
			System.out.printf("--------------학생 성적출력------------------- \n");
			System.out.printf("학번  이름   국어  영어  수학  총점 평균  평점  석차 \n");
			System.out.printf("----------------------------------------------- \n");
			System.out.printf("%d %s %d %d %d %d %.1f %s %d \n", Student_Num1, Student_Name1, Kor1, Eng1, Math1, Total_Sum1, Avg_Num1, Grade1, Rank1);
			System.out.printf("%d %s %d %d %d %d %.1f %s %d \n", Student_Num2, Student_Name2, Kor2, Eng2, Math2, Total_Sum2, Avg_Num2, Grade2, Rank2);
			System.out.printf("----------------------------------------------- \n");	
		
		
	}

}
