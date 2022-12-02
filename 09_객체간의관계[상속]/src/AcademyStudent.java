//2022-11-22

public class AcademyStudent extends AcademyMember {

	public String ban;	// 반
	
	public AcademyStudent() {
		
	}
	
	public AcademyStudent(int no, String name, String ban) {
		this.no = no;
		this.name = name;
		this.ban = ban;
	}
	
	
	public void sutdentPrint() {
		//System.out.println(this.ban +"\t" + this.ban);
		this.print();
		System.out.println(this.ban);
	}
	
	
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
}

	
