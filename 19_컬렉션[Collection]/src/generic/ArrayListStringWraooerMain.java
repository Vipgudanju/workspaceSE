// 2022-12-01

package generic;

import java.util.ArrayList;

public class ArrayListStringWraooerMain {

	public static void main(String[] args) {
		System.out.println(" -------------------- String ----------------------");
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println(" ----------- 1. add --------------");
		nameList.add("장원영");
		nameList.add("안유진");
		nameList.add("윤보미");
		nameList.add("오하영");
		nameList.add("박초롱");
		nameList.add("박하나");
		nameList.add("류주현");
		nameList.add(new String("장원영"));
		System.out.println(nameList);
		System.out.println(" ----------- 2. get --------------");
		System.out.println(nameList.get(1));
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(5));
		
		System.out.println(" ----------- 3. remove(index) --------------");
		nameList.remove(1);
		System.out.println(nameList);
		
		System.out.println(" ----------- 3. remove(element) --------------");
		nameList.remove("박초롱");
		System.out.println(nameList);
		/*
		 * << boolean java.util.ArrayList.remove(Object o) >>
		 Removes the first occurrence of the specified element from this list
		 */
		nameList.remove("장원영");
		System.out.println(nameList);
		System.out.println(" -------------------- Wrapper ----------------------");
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(12);
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println();
		System.out.println("------------- 1. get ---------------");
		int score1 = scoreList.get(2);
		System.out.println(score1);
		int score2 = scoreList.get(scoreList.size()-1); // 이해x
		System.out.println(score2);
		
		System.out.println("------------- 2. set ---------------");
		scoreList.set(2, 99);
		System.out.println(scoreList);
		
		System.out.println("------------- 3. remove ---------------");
		/*
		 *<< Integer java.util.ArrayList.remove(int index) >>
		 */
		scoreList.remove(5);
		/*
		 * Removes the first occurrence of the specified element from this list
		 */
		scoreList.remove(new Integer(90));
		System.out.println(scoreList);
		
		
		

	}

}
