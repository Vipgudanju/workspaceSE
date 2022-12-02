package ABCDE;

import java.util.ArrayList;

import ABCDE.Account;

public class QPWO {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111, "장원영", 33000, 0.5);
		Account acc2 = new Account(2222, "안유진", 12000, 0.1);
		Account acc3 = new Account(3333, "사쿠라", 89000, 0.8);
		Account acc4 = new Account(4444, "허윤진", 45000, 1.2);
		Account acc5 = new Account(5555, "오하영", 99000, 8.9);
		
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size:" + size);
		System.out.println("************* 1. add[맨마지막 index에 객체저장]");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:" +accountList.size());
		System.out.println(accountList);
		
		System.out.println("************* 2. add[지정된 index에 객체저장]");
		accountList.add(2, new Account(3332, "류주현", 77000, 7.7));
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println("************* 3. set(index,element)[지정된 index에 객체저장]");
		accountList.set(5, new Account(9999, "박초롱", 88888, 8.8));
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println("************* 4. get(index) *****************");
		Account getAccount = (Account) accountList.get(1);
		System.out.println(getAccount);
		
		System.out.println("************* 5. remove(index)*****************");
		Account removeAccount = (Account) accountList.remove(accountList.size()-1);
		removeAccount.print();
		System.out.println("#size:" + accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%% 업무실행 %%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("******************* 1. 계좌전체 출력 ************************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
		}
		Account.headerPrint();
		for(Object objectAccount : accountList) {
			((Account)objectAccount).print();
		}
		
		System.out.println("******************* 2. 계좌전체 3333번 한개찾기 ************************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 3333) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("******************* 3. 계좌주 이름번호 '사쿠라'인 계좌 여러개 찾기 ************************");
		for(int i = 0; i <accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("안유진")) {
				((Account)accountList.get(i)).print();
			}
		}
		
		System.out.println("******************* 4. 계좌주 4444번 계좌 한개 삭제 ************************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 4444) {
				System.out.println(">> remove 전 sie:" +accountList.size());
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
				System.out.println(">> remove 후 sie:" +accountList.size());
				break;
			}
		}
		System.out.println(accountList);
		System.out.println("******************* 5. 계좌주 이름번호 '사쿠라'인 계좌 여러개 삭제 ************************");
		for(int i = 0 ; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("사쿠라")) {
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
			}
		}
		
		System.out.println("******************* 6. 계좌전체 출력 ************************");
		Account.headerPrint();
		
		
		
		
	}

}
