//2022-11-16

public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 계좌객체 생성
		 */
		Account account1 = new Account();
		/*
		 * 계좌데이타 대입
		 */
		account1.setAccountData(1111, "PARK", 77000, 3.4);
		/*
		 * 8000원 입금
		 */
		System.out.println("===== 입금 전 =====");
		account1.print();
		account1.deposit(8000);
		System.out.println("===== 입금 후 =====");
		account1.print();
		
		/*
		 * 300원 출금
		 */
		account1.withdraw(300);
		account1.print();
		
		
		
		/************ case2 ***************/
		/*
		 * 1.은행모든계좌에 잔고 50원증가
		 */
		
		/*
		 * 1-1.전체계좌생성 
		 * 1-2.계좌데이타대입
		 */
		Account acc1 = new Account();
		acc1.setAccountData(1000, "LEE" , 89000, 5.6);
		Account acc2 = new Account();
		acc2.setAccountData(2000, "KIM" , 85000, 3.2);
		Account acc3 = new Account();
		acc3.setAccountData(3000, "PARK" , 36000, 2.5);
		
		/*
		 * 1-2.모든계좌잔고 50원증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		
		/*
		 * 2.은행계좌 전체정보출력
		 */
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		
	}

}
