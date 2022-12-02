// 2022-11-28

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.product.Product;

// 2022-11-28

/*
 * import java.lang.*
 * java.lang package에 있는 클래스는 import 구문 생략 가능
 */
public class JavaClassImportMain {

	public static void main(String[] args) {
		System.out.println("--------- java.lang package -----------");
		java.lang.String str1 = "임포드";
		String str2 = "장원영";
		Object object = new Object();
		System.out.println(Math.random());
		
		InputStream in;
		OutputStream out;
		Socket socket;
		
		ShopService shopservice;
		Member m;
		Product b;
		
	}

}
