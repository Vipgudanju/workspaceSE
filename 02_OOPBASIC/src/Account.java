// 2022-11-15

/*
 * 계좌객체를 생성하기 위한 클래스(틀, 타입)
 */

public class Account {
	
	/*
	 * 1. 속성[멥버필드(변수)]
	 */
	
	int no;		// 계좌번호
	String owner;	// 계좌주이름
	int balance;	// 계좌잔고
	double iyul;	// 이율
	
	
	/*
	 * 2. 기능[멤버메서드] - 계좌객체가 가지고 있는 기능
	 */
	
	/*
	 * 계좌데이타를 초기값으로 대입하는 메서드
	 */
	void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
		
	}
	
	/*
	 * 입금
	 */
	void deposit(int money) {
		this.balance += money;
	}
	
	/*
	 * 출금
	 */
	void withdraw(int money) {
		this.balance -= money;
	}
	
	/*
	 * 계좌헤더 출력
	 */
	void headerPrint() {
		System.out.println("======================");
		System.out.printf("%s %5s %4s %4s \n", "번호","이름","잔고","이율");
		System.out.println("======================");
	}
	
	
	/*
	 * 계좌객체 정보출력
	 */
	void print() {
		System.out.printf("%d %6s %8d %5.1f\n", this.no, this.owner, this.balance, this.iyul);
	}
	
	
}
