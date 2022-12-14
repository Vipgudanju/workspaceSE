package ABCDE;

public class StudentArrayMain {

	public static void main(String[] args) {
		
		// 0. 학생배열객체 초기화

		Student[] students = { 
				new Student(1, "장원영", 89, 93, 94), 
				new Student(2, "안유진", 88, 77, 98),
				new Student(3, "류주현", 65, 87, 99), 
				new Student(4, "권은영", 75, 97, 60), 
				new Student(5, "윤보미", 85, 98, 90),
				new Student(6, "오하영", 95, 88, 77), 
				new Student(7, "박초롱", 99, 93, 95), 
				new Student(8, "사쿠라", 83, 80, 99),
				new Student(9, "허윤진", 73, 90, 80)
		};
		
		/*
		 * 1. 전체학생들 개인별 총점,평균,평점계산
		 */
		System.out.println("1. 전체학생들 개인별 총점,평균,평점계산");
		for(int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
			
			System.out.println(
								students[i].getTot()+ "\t" +
								students[i].getAvg()+ "\t" +
								students[i].getGrade()
								);
			
		}
		
		System.out.println(" ------------------------------------------- ");
		
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		
		
		System.out.println("2. 전체학생 총점으로 석차계산");
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].getTot() > students[j].getTot()) {
					students[j].setRank(students[j].getRank()+1);
				}
			}
			students[i].print();
		}
		System.out.println("----------------------------------------------");
		System.out.println();
		
		/*
		 * 3.전체학생 출력
		 */
		System.out.println("3.전체학생 출력");
		Student.headerPrint();
		for(Student student : students) {
			student.print();
		}
		
		
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		
		System.out.println("4.번호3번 학생한명 출력  ");
		Student.headerPrint();
		for (Student student : students) {
			if(student.getNo()==3) {
				student.print();
			}
		}
		
		System.out.println("----------------------------------------------");
		System.out.println();
		
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점이 A인 학생들 출력");
		Student.headerPrint();
		for(Student student : students) {
			if(student.getGrade() == 'A') {
				student.print();
			}
		}
		
		
		
		/*
		 * 6. 학생총점으로 오름차순 정렬
		 */
		System.out.println("6. 학생총점으로 오름차순 정렬");
		for(int i = 0; i < students.length-1; i++) {
			for(int j = 0; j < students.length-1; j++) {
				if(students[j].getTot() < students[j+1].getTot()) {
					
				}
			}
		}
		
		
		
		
	}

}
