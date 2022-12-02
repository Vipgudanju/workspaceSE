// 2022-11-29

import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRunTimeExceptionCatchMain1 {

	public static void main(String[] args) throws Exception {
										 
		try {
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IQException)
		 */
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드(ClassNotFoundException)
		 */
		Class.forName("AClass");
		System.out.println("stmt3");
		 
		/*
		 * 예외발생예상코드(SQLException)
		 */
		DriverManager.getConnection("");
		
		/*
		 * 예외발생예상코드(ArithmeticException)
		 */
		int result = 3/0;
		System.out.println("smt5");
		}catch (IOException e) {
			System.out.println("IOException :" + e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException :" + e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQLException :" + e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}
		System.out.println("main end return");
		
		
	}

}
