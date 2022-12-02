// 2022-12-02

package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

	public static void main(String[] args) {
		/*
		 * Collections 클래스
		 * 	 - Collection 객체들의 uitilty메소드 제공
		 */
		List<Integer> intList = Arrays.asList(34, 45, 78, 90, 23, 10, 99,20);
		List<String> stringList = Arrays.asList("유재석", "박명수", "정준하", "노홍철", "정형돈");
		/*
		List<Account> accountList = Arrays.asList(new Account(4523, "장원영", 33000, 0.5), 
												  new Account(2367, "안유진", 23000, 0.1), 
												  new Account(1234, "윤보미", 89000, 0.2), 
												  new Account(8909, "박초롱", 99000, 0.5), 
												  new Account(2789, "오하영", 12000, 0.3));*/
		
		System.out.println(" ------------------ sort[Integer] -------------------------");
		Collections.sort(intList);
		System.out.println(intList);
		
		System.out.println(" ------------------ reverse[Integer] ----------------------");
		Collections.reverse(intList);
		System.out.println(intList);
		
		System.out.println(" ------------------ shuffle[Integer] ----------------------");
		System.out.println(intList);
		Collections.shuffle(intList);
		System.out.println(intList);
		
		System.out.println(" ------------------ sort[String] -------------------------");
		System.out.println(stringList);
		Collections.sort(stringList);
		System.out.println(stringList);
		
		System.out.println(" ------------------ reverse ----------------------");
		System.out.println(stringList);
		Collections.reverse(stringList);
		System.out.println(stringList);
		
		System.out.println(" ------------------ shuffle[Integer] ----------------------");
		System.out.println(stringList);
		Collections.shuffle(stringList);
		System.out.println(stringList);
		
		System.out.println(" ------------------ Account ----------------------");
		
		List<Account> accountList = Arrays.asList(new Account(4523, "장원영", 33000, 0.5), 
												  new Account(2367, "안유진", 23000, 0.1), 
												  new Account(1234, "윤보미", 89000, 0.2), 
												  new Account(8909, "박초롱", 99000, 0.5), 
												  new Account(2789, "오하영", 12000, 0.3));
		
		System.out.println(" ------------------ reverse ----------------------");
		System.out.println(accountList);
		Collections.reverse(accountList);
		System.out.println(accountList);
		
		System.out.println(" ------------------ shuffle[Integer] ----------------------");
		System.out.println(accountList);
		Collections.shuffle(accountList);
		System.out.println(accountList);
		
		System.out.println(" ------------------ sort[Comparable] -------------------------");
		System.out.println(accountList);
		Collections.sort(accountList);
		System.out.println(accountList);
		System.out.println(" ------------------ sort[Comparator] -------------------------");
		System.out.println(">>> balance desc");
		Collections.sort(accountList, new AccountBalanceDescComparator());
		System.out.println(accountList);
		System.out.println(">>> owner asc");
		Collections.sort(accountList, new AccountOwnerAscComparator());
		System.out.println(accountList);
		
		
	}

}
