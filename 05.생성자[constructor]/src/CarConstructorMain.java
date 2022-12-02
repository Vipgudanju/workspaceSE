
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("********************** car1 **********************");
		Car car1 = new Car();
		car1.setIpChaData("1234" , 12);
		car1.setoutTime(14);
		car1.calculateFee();
		car1.print();
		
		System.out.println("********************** car2 **********************");
		Car car2 = new Car("3453", 15);
		car2.setoutTime(17);
		car2.calculateFee();
		car2.print();
		
		System.out.println("***************오늘주차장 이용차량 출력****************");
		Car cara = new Car("1212", 1, 2, 1000);
		Car carb = new Car("7892", 12, 27, 5000);
		Car carc = new Car("3400", 6, 9, 3000);
		// 출차시간 안나옴
		
		cara.print();
		carb.print();
		carc.print();
		
		
	}

}
