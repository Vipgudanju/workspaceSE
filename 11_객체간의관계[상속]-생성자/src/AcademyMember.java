//2022-11-24

/*
 * AcademyMember들이 가져야할 공통멤버를 가짐
 */

public class AcademyMember extends Object {
	private int no;			// 번호
	private String name;		// 이름
	// public String subject;

	public AcademyMember() {
		
	}
	
	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
		// this.subject = subject;
	}
	
	public void print() {
		System.out.printf(this.no + "\t" + this.name + "\t");
		//System.out.println(this.no + this.name + this.subject);
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
