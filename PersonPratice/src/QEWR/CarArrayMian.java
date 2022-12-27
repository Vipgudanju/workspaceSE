package QEWR;

public class CarArrayMian {

	public static void main(String[] args) {
		
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		
		System.out.println("1.전체 차량 출력");
		Car.headerPrint();
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				carArray[i].print();
			}
		}
		
		System.out.println("2.전체주차구획수");
		System.out.println(carArray.length);
		
		
		System.out.println("3.남은주차구획수");
		int emptcount = 0;
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				emptcount++;
			}
		}
		System.out.println(emptcount);
		
		System.out.println("4.입차");	
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
		
		
		System.out.println("7.2389번 차량 12시 출차");
		/*
		 * 2389차량 찾기
		 * 출차
		 * 영수증 출력
		 * 2389번차량 주차장에서 차량삭제
		 */
		
		Car.headerPrint();
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				if(carArray[i].getNo().equals("2389")) {
					carArray[i].setOutTime(12);
					carArray[i].calculateFee();
					carArray[i].print();
					carArray[i] = null;
					break;
				}
			}
		}
		
		
		
	}

}