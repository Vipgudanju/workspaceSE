// 2022-11-16

public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		
		int returnData1 = mmr.method1();
		System.out.println("main block --> returnData1:"+returnData1);
		
		boolean returnData2 = mmr.method2();
		System.out.println("main block --> returnData2:" + returnData2);
		
		int returnData3 = mmr.add(2132, 32478388);
		System.out.println("main block --> returnData3:" + returnData3);
		System.out.println("main block --> returnData4:" +mmr.add(1, 8));
		
		String name = "이재용";
		String returnMessage1 = mmr.hello(name);
		/*
		 * returnMessage1 --> 이재용님 안녕하세요!!!
		 */  
		// 수정 필요!!!!
		System.out.println("main block-->returnMessage1:"+returnMessage1);
		System.out.println("main block-->returnMessage2:"+mmr.hello("이재용"));
		
		System.out.println("********************** setter 메서드 호출 *****************");
		mmr.setMemberField1(7777777);
		mmr.setMemberField2(8888888);
		mmr.setMemberField3(9999999);
		System.out.println("********************** getter 메서드 호출 *****************");
		System.out.println("------- main block memberField값 사용(출력) ----------");
		/*
		 * int memberField1 = mmr.memberField1; System.out.println("memberField1:"
		 * +memberField1);
		 */
		
		int returnMemberField1 = mmr.getMemebrField1();
		System.out.println("returnMemberField1:" + returnMemberField1);
		System.out.println("returnMemberField2:" + mmr.getMemebrField2());
		System.out.println("returnMemberField3:" + mmr.getMemebrField3());
		
		
				
	}

}
