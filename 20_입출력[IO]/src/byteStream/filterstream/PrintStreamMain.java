// 2022-12-06
package byteStream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args)throws Exception {
		PrintStream consolePrintOut=System.out;
		
		PrintStream filePrintOut=
				new PrintStream(
						new FileOutputStream("printStream.txt"));
		String str="프린트스트림을 공부합니다";
		double d = 3.14159;
		char c = '힣';
		Object o = new Object();
		boolean isMarried = true;
		
		consolePrintOut.println(str);
		filePrintOut.println(str);
		consolePrintOut.println(d);
		filePrintOut.println(d);
		consolePrintOut.println(c);
		filePrintOut.println(c);
		System.out.println(o.toString());
		filePrintOut.print(o);
		System.out.println(isMarried);
		filePrintOut.print(isMarried);
		//System.out.print();
		// 마저 작성하기
		
		
	}

}
