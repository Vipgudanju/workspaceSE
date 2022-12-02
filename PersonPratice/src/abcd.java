
public class abcd {

	// 멤버필드
	int abcdField1;
	char abcdField2;
	double abcdField3;
	
	// 멤버 메서드[기능]
	// 객체의 멤버들의 내용을 출력하는 메서드
	
	void print() {
		/*
		 * this :
		 * -self 참조변수
		 * -void print() 메서드를 가지고 있는 객체의 주소값
		 * -this는 생략 가능
		 */
		System.out.println("abc1.print() 메서드 안에서 this:" + this);
		System.out.println(
							this.abcdField1+"\t"+
							this.abcdField2+"\t"+
							this.abcdField3);
		
		
		
		
		
		
		
		
		
		
				
		
	}
	
	
}
