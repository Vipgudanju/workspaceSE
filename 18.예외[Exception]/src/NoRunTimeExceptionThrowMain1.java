// 2022-11-29

import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;

public class NoRunTimeExceptionThrowMain1 {

	public static void main(String[] args) throws Exception {
										 /*throws IOException,ClassNotFoundException*/
		
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
		
		
		
	}

}
