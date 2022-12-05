// 2022-12-05()
package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {
	// 파일 복사 해결해보기
	public static void main(String[] args) throws Exception{
		
		//String fileName = "game_back.jpg";
		String fileName = "a.pdf";
		String copiedFileName = fileName.replace(".", "_copy.");
		
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream(copiedFileName);
		
		int byteCount = 0;
		int starCount = 0;
		while(true) {
			int readByte = fis.read();
			if(readByte == -1)break;
			byteCount++;
			if(byteCount%1024 == 0) {
				System.out.println("*");
				starCount++;
				if(starCount%20 == 0) {
					System.out.println();
				}
			}
			fos.write(readByte);
		}
		
		 System.out.println("FileCopy:" + byteCount + "bytes copy");
		 fis.close();
		 fos.close();
		 
		
	}

}
