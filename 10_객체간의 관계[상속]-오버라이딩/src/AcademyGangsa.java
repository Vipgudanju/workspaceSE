// 2022-11-23

public class AcademyGangsa extends AcademyMember {

	private String subject; // 과목
	
	public AcademyGangsa() {
		
	}
	
	public AcademyGangsa(int no, String name, String subject) {
		this.no = no;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public void print() {
		//this.print();
		super.print();
		System.out.println(this.subject);
	}
	
	
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
}
