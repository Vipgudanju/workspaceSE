// 2022-11-15 + 17 + 23

/*
 * 1. 주차장에서 차 객체를 생성할 클래스(를)
 * 2. Car 객체의 주소를 저장할 수 있는 타입
 */

/**
 * 차객체를 생성하기 위한 클래스
 * @author 장원영
 * @version 1.0
 */

public class Car {

	/*
	 * 클래스의 구성요소
	 * 1. 멤버필드(변수) [속성]: 차 객체의 속성데이타를 저장할 변수
	 * 2. 멤버메서드[기능]	   : 차 객체의 외부에 제공하는 기능
	 */
	/*
	 * 멤버필드[속성]
	 */
	
	private String no;	  	// 차량번호
	private int inTime;	 	// 입차시간
	private int outTime; 	// 출차시간
	private int fee;	 	// 주차요금
	
	/*
	 * 생성자메소드[초기화]
	 */
	/*
	 * 멤버필드의 기본값을 가진 차객체 생성
	 */
	
	/**
	 * 기본초기값을 가진 차객체를 생성
	 */
	
	public Car() {
		
	}
	/*
	 * 차량번호, 입차시간을 인자로 받아서
	 * 멤버필드의 값을 가진 차객체 생성
	 */
/**
 * 입차데이타로 초기화된 차량객체생성
 * @param no		차량번호
 * @param inTime	입차시간
 */
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 차량멤버 데이타를 인자로 받아서
	 * 멤버필드의 값을 가진 차객체 생성
	 */
	/**
	 * 매개변수로 초기화된 차량객체생성
	 * @param no		차량번호
	 * @param inTime	입차시간
	 * @param ouTime	출차시간
	 * @param fee		주차요금
	 */
	public Car(String no, int inTime, int ouTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	
	
	/*
	 * 멤버메소드[기능]
	 */
	
	/*
	 * 입차시 데이타(번호, 시간) 대입
	 */
	/**
	 * 입차시입차데이타 대입메소드
	 * @param no		차량번호
	 * @param InTime	입차시간
	 */
	public void setIpChaData(String no, int InTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 출차시간 멤버필드 outTime에 출차시간데이타 대입(set)
	 */
	
	public void setoutTime(int outTime) {
		this.outTime=outTime;
	}
	
	/*
	 * 주차요금 계산
	 */
	/**
	 * 주차요금계산 
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	
	/*
	 * 헤더정보 출력
	 */
	public void headerPrint() {
		System.out.println("============================================================");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("============================================================");
	}
	
	
	/*
	 * 차량정보 출력
	 */
public void print() {
		
		System.out.printf("%7s %7d %7d %8d\n",this.no,this.inTime,this.outTime,this.fee);
	}

	/*
	 * getter, setter 메소드 자동생성단축키
	 * Alt + Shift + s
	 */
	
	
	public String getNo() {
		return no;
	}

	public int getInTime() {
		return inTime;
	}

	public int getOutTime() {
		return outTime;
	}
	/**
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}
	
	public void setNo(String no) {
		this.no = no;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	
	
}
