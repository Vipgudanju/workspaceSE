// 2022-12-01

package generic;

import nogeneric.Account;

public class MyArrayListMain {

	public static void main(String[] args) {
		
		MyArrayList<Account> myArrayList = new MyArrayList<Account>();
		myArrayList.add(new Account(1111, "장원영", 33000, 0.5));
		myArrayList.add(new Account(2222, "사쿠라", 12000, 0.1));
		myArrayList.add(new Account(3333, "사쿠라", 89000, 0.8));
		myArrayList.add(new Account(4444, "허윤진", 45000, 1.2));
		myArrayList.add(new Account(5555, "오하영", 99000, 8.9));
		
		System.out.println("----add---");
		System.out.println("#list size:"+myArrayList.size());
		Account account=myArrayList.get(0);
		System.out.println(account);
		System.out.println("----remove---");
		Account removeAccount=
				myArrayList.remove(0);
		removeAccount.print();
		System.out.println("#list size:"+myArrayList.size());
		
		
		
	}

}
