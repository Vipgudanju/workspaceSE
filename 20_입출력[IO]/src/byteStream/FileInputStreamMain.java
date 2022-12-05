// 2022-12-05

package byteStream;

import java.io.FileInputStream;

/*
 * <<입력스트림(OutputStream)사용방법>>
 * 1. 데이타 source 선정(파일)
 * 2. 입력스트림(OutputStream)객체생성(FileOutputStream)
 * 3. 입력스트림(OutputStream)에 한바이트씩 읽는다.(write)
 * 4. 입력스트림(OutputStream)닫는다.(close) 
 */

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("fileOut.dat");
		
		int readByte =  fis.read();
		System.out.println("1.byte:" +Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("2.byte:" + Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("3.byte:" + Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("4.byte:" + Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("FileInputStream.read() <---------- fileOut.dat");
		
		int byteCount = 0;
		while(true) {
			readByte = fis.read();
			if(readByte == -1) {
				break;
			}
			System.out.println(Integer.toBinaryString(readByte));
		}
		
		fis.close();
		System.out.println("FileInputStream.read()z <------ fileOut.dat:" + byteCount + "바이트 있음");
		
		

	}

}
