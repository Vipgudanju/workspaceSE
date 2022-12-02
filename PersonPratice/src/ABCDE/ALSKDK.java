package ABCDE;

import java.util.ArrayList;

public class ALSKDK {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111, "장원영", 33000, 0.5);
		Account acc2 = new Account(2222, "사쿠라", 12000, 0.1);
		Account acc3 = new Account(3333, "사쿠라", 89000, 0.8);
		Account acc4 = new Account(4444, "허윤진", 45000, 1.2);
		Account acc5 = new Account(5555, "오하영", 99000, 8.9);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		System.out.println("# list size:" + accountList.size());
		System.out.println(" ---------------- 1. add(element) -----------------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# list size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println(" ---------------- 2. add(index, element) -----------------");
		accountList.add(2, new Account(3332, "윤보미", 99999, 7.7));
		System.out.println("# list size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println(" ---------------- 4. get(index) -----------------");
		Account getAccount = accountList.get(0);
		getAccount.print();
		
		System.out.println(" ---------------- 5. remove(index) -----------------");
		Account removeAccount = accountList.remove(0);
		System.out.println("# list size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%%%%%%%% 업무실행 $$$$$$$$$$$$$$$$$$$");
		System.out.println(" *************** 1. 계좌 전체 출력");
		Account.headerPrint();
		for(int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		for (Account account : accountList) {
			account.print();
		}
		
		
		System.out.println(" ******************** 2. 계좌번호 3333번 계좌 찾기 ******************");
		for (Account account : accountList) {
			if(account.getNo() == 3333) {
				account.print();
				break;
			}
		}
		
		System.out.println(" ******************* 3. 계좌주 이름 사쿠라 계좌 여러개 찾기 *******************");
		for (Account account : accountList) {
			if(account.getOwner().equals("사쿠라")) {
				account.print();
			}
		}
		
		System.out.println("**********4.계좌번호 4444번 계좌1개삭제*******");
		for (Account account : accountList) {
			if(account.getNo() == 4444) {
				accountList.remove(account);
				break;
			}
		}
		
		System.out.println("************ 5. 계좌이름 사쿠라 계좌 여러개 삭제");
		for(int i = 0; i < accountList.size(); i ++) {
			if(accountList.get(i).getOwner().equals("사쿠라")) {
				accountList.remove(i).print();
			}
		}
		
		
		
		
		

	}

}
