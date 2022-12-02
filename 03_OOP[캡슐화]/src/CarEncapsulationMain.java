// 2022-11-17

public class CarEncapsulationMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setIpChaData("1234", 12);
		
		car1.setoutTime(16);
		car1.calculateFee();
		car1.print();
		
		/*
		 * car1 객체의 주차요금
		 */
		/*
		System.out.println(car1.fee);
		int car1Fee = car1.getFee(); <- 오류
		System.out.println("car1의 주차요금: " + car1Fee);
		*/
		
		/*
		 * car1 객체의 주차요금 대입
		 */
		car1.setFee(0);
		car1.print();
		
		
		
		
	}

}
