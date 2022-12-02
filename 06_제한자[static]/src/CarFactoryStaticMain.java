// 2022-11-18

public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car c1 = new Car(1, "SM7", "SILVER");
		Car c2 = new Car(2, "SM6", "BLACK");
		Car c3 = new Car(3, "SM5", "RED");
		
		System.out.println("차량총생산대수:" + Car.count);
		
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
		
	}

}
