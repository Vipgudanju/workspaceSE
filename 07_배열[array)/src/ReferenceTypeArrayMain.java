// 2022-11-22

public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a= 345;
		Account acc = new Account(8989, "SIM", 56000, 3.2);
		int[] ia = new int[5];
		ia[0] = 23;
		*/
		// Account[] accArray = new Account();  <- 타입이 틀려서 오류
		Account[] accArray = new Account[5];
		accArray[0] = new Account(1111, "윤보미", 80000, 1.3);
		accArray[1] = new Account(2222, "오하영", 99000, 9.3);
		accArray[2] = new Account(3333, "박초롱", 77000, 8.3);
		accArray[3] = new Account(4444, "정은지", 34000, 6.3);
		accArray[4] = new Account(5555, "김남주", 46460, 5.3);
		
		Account.headerPrint();
		for(int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
		
		
		
	}

}
