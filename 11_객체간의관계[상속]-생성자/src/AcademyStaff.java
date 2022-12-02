// 2022-11-24

public class AcademyStaff extends AcademyMember {

	private String depart;  // 부서
	
	public AcademyStaff() {
		super();
	}
	
	
	public AcademyStaff(int no, String name, String depart) {
		super(no, name);
		this.depart = depart;
		//this.no = no;
		//this.name = name;
	}
	
	/*
	 * 재정의
	 */
	
	@Override
	public void print() {
		//this.print();
		super.print();
		System.out.println(this.depart);
	}

	



	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}
