// 2022-12-01

package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println(" --------------- String -----------------");
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("장원영");
		nameSet.add("안유진");
		nameSet.add("류주현");
		nameSet.add("권은영");
		System.out.println(nameSet);
		boolean isAdd = nameSet.add("장원영");
		System.out.println("추가여부:" +isAdd);
		System.out.println(nameSet);
		
		System.out.println(" ---------------- Integer ------------------");
		
		HashSet<Integer> lottoSet = new HashSet<>();
		while(lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random()*45+1));
		}
		
		
		System.out.println(lottoSet);
				
		
		

	}

}
