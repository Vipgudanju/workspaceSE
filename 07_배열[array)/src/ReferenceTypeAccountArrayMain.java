// 2022-11-22 + 24

public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		
		System.out.println(" ----------------- 값목록으로 배열 생성 -----------------");
		Account acc1 = new Account(1111, "이승엽", 56000, 0.9);
		Account[] accounts = {
							  //acc1, <- 기존 작성(있고 없고의 유무?)
							  new Account(2222, "장원삼", 58000, 1.3),
							  new Account(3333, "심수창", 54000, 2.3),
							  new Account(4444, "류현인", 68000, 3.3),
							  new Account(5555, "이대은", 78000, 4.3),
							  new Account(6666, "김선우", 88000, 5.3),
							  new Account(7777, "정근우", 98000, 6.3),
							  new Account(8888, "유희관", 53000, 7.3),
							  new Account(9999, "송승준", 54000, 8.3),
		};
		
		System.out.println("1.은행총계좌수:" + accounts.length);
		System.out.println("2.은행계좌 전체출력");
		Account.headerPrint();
		for(int i = 0 ; i < accounts.length; i++) {
			/*Account tempAccount = accounts[i];
			tempAccount.print();
			*/
			accounts[i].print();
		}
		
		System.out.println("3.은행계좌들 총잔고");
		int totBalance = 0;
		for(int i = 0; i < accounts.length; i++) {
			//totBalance = toBalance + accounts[i].getBalance();
			totBalance += accounts[i].getBalance();
		}
		System.out.println(" >>" + totBalance);
		
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for(int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if(account.getNo() == 3333) {
				account.print();
				break;
			}
		}
		
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for(Account tempAccount:accounts) {
			if(tempAccount.getBalance()> 50000) {
				tempAccount.print();
		   }
		}
		
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		
		
		System.out.println("6.은행 계좌들중에서 이름이 장원삼인 계좌 여러개를 찾아서 출력[String객체 배우고 난 후에");
		
		
		System.out.println("7.6666번계좌 3000원입금");
		for(Account account:accounts) {
			if(account.getNo() == 6666) {
				System.out.println(">>> 입금전");
				account.print();
				account.deposit(3000);
				System.out.println(">>> 입금후");
				account.print();
				break;
			}
		}
		
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		
		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		System.out.println(" ******************* 정렬 전 **********************");
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		// 1회 정렬
		for(int i = 0; i < accounts.length-1; i++) {
		for(int j = 0; j < accounts.length-1; j++) {
			//Account account1 = accounts[j];
			//Account account2 = accounts[j + 1];
			if(accounts[j].getBalance() > accounts[j + 1].getBalance()) {
				Account tempAccount = accounts[j];
				accounts[j] = accounts[j+1];
				accounts[j+1] = tempAccount;
			}
		  }
		}
		System.out.println(" ******************* 정렬 후 **********************");
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		
		System.out.println("9.계좌잔고순으로 내림차순정렬[Quiz]");
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		System.out.println("9.계좌이름순으로 오름(내림)차순정렬(String 클래스를 배운후에 추가)");
		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for(Account account:accounts) {
			if(account.getNo() == 5555) {
				account.setIyul(3.6);
				account.setIyul(3.6);
				account.print();
				
				break;
			}
		}
		
		
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for(Account account : accounts) {
			if(account.getBalance() == 50000) {
				account.deposit(50);
				account.print();
			}
		}
		
		System.out.println(" ---------- Account에 재정의된 toString 메소드");
		for(Account account:accounts)
			System.out.println(account);
		
		System.out.println("----------------------------Account객체추가----------------------------");
		System.out.println("----------------------------Account객체삭제----------------------------");
		
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 8888계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		****************************************************/	
		
		
	}

}
