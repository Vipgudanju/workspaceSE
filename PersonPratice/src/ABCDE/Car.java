package ABCDE;

public class Car {
	public int no;			// 차량번호
	public String model;	// 차량모델명
	
	// 차량엔진
	public Engine engine;	// 차량엔진 객체주소를 저장할 멤버필드
	
	public Car() {
		
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine =  engine;
	}
	
	
	
	
	
	
	
	
}
