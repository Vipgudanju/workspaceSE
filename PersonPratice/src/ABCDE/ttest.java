/*public class ttest {

	
   	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 
   	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
   	 

   	
   	멤버변수 선언
   	
   	private int no;
   	private String name;
   	private int kor;
   	private int eng;
   	private int math;
   	private int tot;
   	private double avg;
   	private char grade;
   	private int rank=1;
   	
   	 * <<생성자메쏘드 선언[오버로딩]>>
   	 *  - 인자 0개짜리 생성자(기본생성자선언) 
   	 *  - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
   	 
   	public Student() {
   		
   	}
   	
   	public Student(int no, String name, int kor, int eng, int math) {
   		
   		this.no = no;
   		this.name = name;
   		this.kor = kor;
   		this.eng = eng;
   		this.math = math;
   	}

   	
   	멤버메쏘드 선언
   	
   	public void setStudentData(int no, String name, int kor, int eng, int math) {
   		this.no = no;
   		this.name = name;
   		this.kor = kor;
   		this.eng = eng;
   		this.math = math;
   	}

   	public void calculateTotal() {
   		this.tot = this.kor + this.eng + this.math;
   	}

   	public void calculateAvg() {

   		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
   	}

   	public char calculateGrade() {

   		if (this.avg >= 90)
   			this.grade = 'A';
   		else if (this.avg < 90 && this.avg >= 80)
   			this.grade = 'B';
   		else if (this.avg < 80 && this.avg >= 70)
   			this.grade = 'C';
   		else if (this.avg < 70 && this.avg >= 60)
   			this.grade = 'D';
   		else
   			this.grade = 'F';

   		return grade;
   	}
   	
   	

   	public static void headerPrint() {
   		System.out.printf("---------------학생 성적출력-------------------%n");
   		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
   		System.out.printf("-----------------------------------------------%n");

   	}

   	public void print() {
   		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
   				this.tot, this.avg, this.grade, this.rank);
   	}

   	public int getNo() {
   		return no;
   	}

   	public void setNo(int no) {
   		this.no = no;
   	}

   	public String getName() {
   		return name;
   	}

   	public void setName(String name) {
   		this.name = name;
   	}

   	public int getKor() {
   		return kor;
   	}

   	public void setKor(int kor) {
   		this.kor = kor;
   	}

   	public int getEng() {
   		return eng;
   	}

   	public void setEng(int eng) {
   		this.eng = eng;
   	}

   	public int getMath() {
   		return math;
   	}

   	public void setMath(int math) {
   		this.math = math;
   	}

   	public int getTot() {
   		return tot;
   	}

   	public void setTot(int tot) {
   		this.tot = tot;
   	}

   	public double getAvg() {
   		return avg;
   	}

   	public void setAvg(double avg) {
   		this.avg = avg;
   	}

   	public char getGrade() {
   		return grade;
   	}

   	public void setGrade(char grade) {
   		this.grade = grade;
   	}

   	public int getRank() {
   		return rank;
   	}

   	public void setRank(int rank) {
   		this.rank = rank;
   	}
	
	
	
	
}*/

/*package itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		
		
		 * 0.학생배열객체초기화
		 
		Student[] students = { 
				new Student(1, "KIM", 89, 93, 94), 
				new Student(2, "HIM", 88, 77, 98),
				new Student(3, "AIM", 65, 87, 99), 
				new Student(4, "BIM", 75, 97, 60), 
				new Student(5, "XIM", 85, 98, 90),
				new Student(6, "KIM", 95, 88, 77), 
				new Student(7, "ZIM", 99, 93, 95), 
				new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80)
		};
		
		 * 1. 전체학생총점,평균,평점계산
		 
		System.out.println("1. 전체학생총점,평균,평점계산");
		for(int i=0; i<students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
			
			System.out.println(
					students[i].getTot()+"\t"+
					students[i].getAvg()+"\t"+
					students[i].getGrade());
		}
		
		
		
		 * 2. 전체학생 총점으로 석차계산
		 
		System.out.println("2. 전체학생 총점으로 석차계산");
		for (int i = 0; i < students.length; i++) {
			for(int j=0;j<students.length;j++) {
				if(students[i].getTot() > students[j].getTot()) {
					students[j].setRank(students[j].getRank()+1);
				}
			}
			students[i].print();
		}
		
		
		 * 3. 전체학생출력
		 
		System.out.println("3. 전체학생출력 ");
		Student.headerPrint();
		for (Student student : students) {
			student.print();
		}
		
		
		
		 * 4. 번호3번 학생한명 출력
		 
		System.out.println("4.번호3번 학생한명 출력  ");
		Student.headerPrint();
		for (Student student : students) {
			if(student.getNo()==3) {
				student.print();
			}
		}
		
		
		
		 * 5. 학점A인 학생들 출력
		 
		System.out.println("5. 학점A인 학생들 출력");
		Student.headerPrint();
		for (Student student : students) {
			if(student.getGrade() == 'A') {
				student.print();
			}
		}
		
		
		 * 6. 학생총점으로 오름차순정렬
		 
		System.out.println("6. 학생총점으로 내림(오름)차순정렬");
		for(int i = 0; i < students.length -1; i++) {
			for(int j = 0; j < students.length -1; j++) {
				if(students[j].getTot() < students[j+1].getTot()) {
					Student tempStudent = students[j];
					students[j] = students[j+1];
					students[j+1] = tempStudent;
				}
			}
		}
		
		Student.headerPrint();
		for(int i=0; i<students.length; i++) {
			students[i].print();
		}
		
		
		
		
	}

*/

/*



 */

/*public class Car {
	
	클래스의 구성요소
	   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 생성자메쏘드
	   3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	
	
	//1.멤버필드(변수)[속성]
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	//2. 생성자메쏘드
	public Car() {
		
	}
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	//3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	
	 *  입차시데이타(번호,입차시간)대입
	 
	public void setIpChaData(String no,int inTime) {
		
		this.no = no;
		this.inTime=inTime;
		
		this.setNo(no);
		this.setInTime(inTime);
	}
	
	
	 * 요금계산
	 
	public void calculateFee() {
		this.fee  =(this.outTime-this.inTime)*1000;
	}
	
	public static void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	
	 * 차량정보출력
	 
	public  void print() {
		System.out.printf("%7s %7d %9d %8d%n",this.no,this.inTime,this.outTime,this.fee);
		return;
	}
	//setter,getter
	
	 * 출차시간 대입
	 
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
}

*/




/*public class CarArrayMain {

	public static void main(String[] args) {
		//Car[] carArray=new Car[30];
		
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		
		null.메쏘드() --> NullPointerException
		 
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				carArray[i].print();
			}
		}
		
		
		System.out.println("2.전체주차구획수");
		System.out.println(carArray.length);
		
		
		System.out.println("3.남은주차구획수");
		int  emptcount = 0;
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				emptcount++;
			}
		}
		System.out.println(emptcount);
		
		
		System.out.println("4.입차");
		
		 * 1.차량객체생성
		 * 2.빈자리찾아서대입
		 
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				if(carArray[i].getNo().equals("7789")) {
					carArray[i].print();
				}
			}
		}
		
		
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				if(carArray[i].getInTime() >= 10) {
					carArray[i].print();
				}
			}
		}
		
		
		System.out.println("7.2389번차량 12시 출차");
		
		
		
		
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 2389번차량 주차장에서 차량삭제
		 
		Car.headerPrint();
		for(int i=0;i<carArray.length;i++) {
			if(carArray[i]!=null) {
				if(carArray[i].getNo().equals("2389")) {
					carArray[i].setOutTime(12);
					carArray[i].calculateFee();
					carArray[i].print();
					carArray[i]=null;
					break;
				}
			}
		}
		System.out.println();
		
		System.out.println("99. 2389번차량 출차후전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}

}*/