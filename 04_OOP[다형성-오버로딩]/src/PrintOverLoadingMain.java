//2022-11-17

public class PrintOverLoadingMain {

	public static void main(String[] args) {
		Print p = new Print();
		p.print(1);
		p.print(1,2,3);
		p.print(1,2);
		
		
		p.print(false);
		p.print(213);
		p.print(3,1);
		p.print("Apink");
		p.print('A');
		p.print(214212);
		
		
		
	}

}
