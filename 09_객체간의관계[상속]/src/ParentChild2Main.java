// 2022-11-22

public class ParentChild2Main {

	public static void main(String[] args) {
		
		System.out.println("----------- child1 -------------");
		Child1 child1 = new Child1();
		child1.member1 = 1;
		child1.member2 = 2;
		child1.member3 = 3;
		child1.member4 = 4;
		
		child1.method1();
		child1.method2();
		child1.method3();
		child1.method4();
		
		System.out.println(">> child1 주소:" + child1);
		System.out.println();
		
		System.out.println("----------- child2 -------------");
		
		Child2 child2 = new Child2();
		child2.member1 = 1;
		child2.member2 = 2;
		child2.member5 = 5;
		
		child2.method1();
		child2.method2();
		child2.method5();
		
		System.out.println(">> child2 주소: " + child2);
		System.out.println();
		
		/*
		System.out.println("----------- Parent -------------");
		
		Parent p = new Parent();
		p.member1 = 1111;
		p.member2 = 2222;
		
		p.method1();
		p.method2();
		
		System.out.println();
		*/
	}

}
