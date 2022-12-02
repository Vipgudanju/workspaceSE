// 2022-11-25

package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String st1 = "Have a nice day!!!";
		String st2 = "오늘은 금요일 String 클래스를 공부해요";
		System.out.println("-----------length");
		int length1 = st1.length();
		int length2 = st2.length();
		int length3 = "자바가 재미있어요!!!!".length();
		String emptStr = "";
		int length4 = emptStr.length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		System.out.println("------------------- null -------------------");
		String id = null;
		//String id = "";
		if(id == null || id.equals("")) {
			System.out.println("아이디를 입력하세요!!");
		}
		System.out.println("-------------- substring -------------------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("오늘은 금요일 String 클래스를 공부해요".substring(4,8));
		
		System.out.println("------------- charAt -----------------------");
		String userId = "test#00";
		char firstChar = userId.charAt(0);
		System.out.println(">> 아이디의 첫글자는 영문대(소)문자여야 한다.");
		if((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z')) {
			System.out.println(firstChar + " 는 아이디 첫글자로 유효합니다.");
		}else {
			System.out.println(firstChar+ " 는 아이디 첫글자로 유효안합니다.");
		}
		for(int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.println(tempChar+":" +(int)tempChar);
		}
		System.out.println("-------------- split --------------------------");
		String cardNo = "123-456-8990-4562";
		String[] cardNoArray = cardNo.split("-");
		for(String tempNo:cardNoArray) {
			System.out.println(tempNo);
		}
		
		System.out.println("------------- replace -------------------------");
		String str3=("자바는 객체지향언어입니다. 우리는 자바를 공부합니다.");
		String result3 = str3.replace('자', '암');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3);
		System.out.println("------------ toUpperCase, toLowerCase ---------");
		System.out.println("jAvA".toUpperCase());
		System.out.println("jAvA".toLowerCase());
		System.out.println("------------- startsWith, endWith ---------------");
		String name = "장원영";
		if(name.startsWith("박")) {
			System.out.println("박씨인사람:" +name);
		}
		System.out.println(" ----------------------- 친구들 --------------------");
		String[] names = {"윤보미", "박초롱", "안유진", "박하나", "허윤진"};
		for(int i = 0; i < names.length; i++) {
			if(names[i].startsWith("박")) {
				System.out.println(names[i]);
			}
		}
		/*Quiz
		 * 박씨를 새로운 배열에 담아
		 */
		String[] parkArray = null;
		System.out.println("-------------------------------------------------------");
		System.out.println("----------------------endsWith-------------------------");
		String fileName = "a.jpg";
		if(fileName.endsWith("a.jpg") || fileName.endsWith(".gif")) {
			System.out.println("이미지파일입니다:" +fileName);
		}
		System.out.println("----------------------trim------------------------------");
		String id2 = " guar d";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		String chatMessage = "               " ;
		if(chatMessage.trim().length() == 0) {
			System.out.println("전송안해요~~~");
		}
		if(chatMessage.trim().equals("")) {
			System.out.println("전송안해요~~~");
		}
		
		
		
		
		
	}

}
