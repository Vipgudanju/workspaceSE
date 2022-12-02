
public class abcdMain {

	public static void main(String[] args) {
		
		abcd abc1 = new abcd();
		abc1.abcdField1 = 1;
		abc1.abcdField2 = 'A';
		abc1.abcdField3 = 95.4;
		
		// abcd 객체 내용출력
		
		System.out.println(abc1.abcdField1 +"\t"+
							abc1.abcdField2 +"\t"+
							abc1.abcdField3);
		
		// abcd 객체 내용 출력 메서드 호출
		
		System.out.println("main block --> abc1 주소값:" +abc1);
		abc1.print();
		
		
		
		
		
	}

}
