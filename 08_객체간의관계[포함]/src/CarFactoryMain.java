// 2022-11-21

public class CarFactoryMain {

	public static void main(String[] args) {
		
		/*
		 * 자동차 공장
		 */
		/*
		Engine nissanEngine = new Engine();
		nissanEngine.type = "VQ";
		nissanEngine.cc = 3500;
		
		Car nissanCar = new Car();
		nissanCar.no = 4827;
		nissanCar.model = "SM7";
		nissanCar.engine = nissanEngine;
		System.out.println(nissanCar.no+"\t"+
							nissanCar.model+"\t"+ 
							nissanCar.engine.type+"\t"+
							nissanCar.engine.cc);
		*/
		Engine nissanEngine = new Engine();
		nissanEngine.setType("VQ");
		nissanEngine.setCc(3500);
		
		Car nissanCar = new Car();
		nissanCar.setNo(4827);
		nissanCar.setModel("SM7");
		nissanCar.setEngine(nissanEngine);
		nissanCar.print();
		
		
		System.out.println(" ------- 차량엔진검사 ---------");
		Engine returnEngine = nissanCar.getEngine();
		returnEngine.print();
		System.out.println();
		
		
		Car benzCar = new Car(8899, "G바겐", new Engine("W222", 3500));
		benzCar.print();
		System.out.println(" ------- 차량엔진검사 ---------");
		benzCar.getEngine().print();;
		
		
	
	}

}
