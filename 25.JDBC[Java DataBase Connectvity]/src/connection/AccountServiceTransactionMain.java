package connection;

public class AccountServiceTransactionMain {

	public static void main(String[] args) throws Exception{
		AccountService accountService = new AccountService();
		
		/*
		 * 모든 잔고 트랜잭션
		 */
		
		accountService.updateBalance(1);

	}

}
