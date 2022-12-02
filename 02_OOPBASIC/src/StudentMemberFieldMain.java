
public class StudentMemberFieldMain {

public static void main(String[] args) {
		
		
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		
		
		
		 stu1.num = 1;
		 stu1.name = "이재용";
		 stu1.kor = 42;
		 stu1.eng = 56;
		 stu1.math = 78;
		 
		 stu2.num = 2;
		 stu2.name = "팀쿡";
		 stu2.kor = 45;
		 stu2.eng = 53;
		 stu2.math = 76;
		 
		
		
		
		
		 stu1.total = stu1.kor + stu1.eng + stu1.math ;
		 stu1.avg = (double)stu1.total /3;
		 
		 if(stu1.grade >= 90 && stu1.grade <= 100) {
			 stu1.grade = 'A';
		 }else if(stu1.grade >= 80 && stu1.grade <= 89) {
			 stu1.grade = 'B';
		 }else if(stu1.grade >= 70 && stu1.grade <= 79) {
			 stu1.grade = 'C';
		 }else if(stu1.grade >= 60 && stu1.grade <= 69) {
			 stu1.grade = 'D';
		 }else
			 stu1.grade ='F';
		 
		
		
		 stu2.total = stu2.kor + stu1.eng + stu1.math ;
		 stu2.avg = (double)stu2.total /3;
		 
		 if(stu2.grade >= 90 && stu2.grade <= 100) {
			 stu2.grade = 'A';
		 }else if(stu2.grade >= 80 && stu2.grade <= 89) {
			 stu2.grade = 'B';
		 }else if(stu2.grade >= 70 && stu2.grade <= 79) {
			 stu2.grade = 'C';
		 }else if(stu2.grade >= 60 && stu2.grade <= 69) {
			 stu2.grade = 'D';
		 }else {
			 stu2.grade ='F';
		 }
		
		
		// 해결
		 System.out.printf("--------------학생 성적출력-------------------%n");
			System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
			System.out.printf("-----------------------------------------------%n");
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu1.num,stu1.name, stu1.kor,stu1.eng,stu1.math,stu1.total,stu1.avg,stu1.grade, 3);
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu2.num,"stu2.name", stu2.kor,stu2.eng,stu2.math,stu2.total,stu2.avg,stu2.grade, 2);
		 
		
	}

}
