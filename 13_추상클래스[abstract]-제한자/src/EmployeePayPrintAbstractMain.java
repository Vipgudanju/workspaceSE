// 2022-11-25

public class EmployeePayPrintAbstractMain {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new SalaryEmployee(1, "장원영", 30000000),
				new SalaryEmployee(2, "안유진", 50000000),
				new SalaryEmployee(3, "허윤진", 50000000),
				new HourlyEmployee(4, "김유정", 100, 20000),
				new HourlyEmployee(5, "윤보미", 100, 9000),
		};

		for(Employee emp:emps) {
			emp.calculatePay();
			System.out.println("-------------" +emp.getName()+" 님 급여명세표 -------------");
			emp.print();
			System.out.println("-----------------------------------------------------------");
			System.out.println();
		}
		
		
	}

}
