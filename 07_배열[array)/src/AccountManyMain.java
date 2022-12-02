// 2022-11-22

public class AccountManyMain {

	public static void main(String[] args) {
		
		AccountMany accountMany = new AccountMany();
		accountMany.acc0 = new Account(1, "KIM", 3000, 0.5);
		accountMany.acc1 = new Account(2, "BIM", 4000, 1.5);
		accountMany.acc2 = new Account(3, "MIM", 5000, 2.5);
		accountMany.acc3 = new Account(4, "NIM", 6000, 3.5);
		accountMany.acc4 = new Account(1, "SIM", 7000, 4.5);
		
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc0.print();
		
	}

}
