// 2022-12-05
package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{
		String fileName = "1.자바소개.pdf";
		String copiedFileName = fileName.replace(".", "_copy.");
		
		FileInputStream fis = new FileInputStream("fileName");
		FileOutputStream fos = new FileOutputStream("fileName");
		
		while(true) {
			int readByte = fis.read();
			if(readByte == -1)break;
			System.out.println(Integer.toBinaryString(readByte));
		}
		
		fis.close();
		fos.close();
		
	}

}
