// 2022-12-05
package characterStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteReaderMain {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("fileWriter.txt");
		
		fw.write(44356);
		fw.write('A');
		fw.write('박');
		
		for(int i = 0; i < 65536; i++) {
			fw.write(i);
			if(i%100 == 0) {
				fw.write('\n');
			}
		}
		
		fw.write('\n');
		fw.write("문자열을 맘대로 막 적어요~~~");
		fw.write('\n');
		fw.write("한라인");
		fw.write("\n");
		fw.write("두라인\n");
		fw.write("세라인\n");
		
		/*
		 * 버퍼에 있는 문자열을 출력스트림에 쓴다.
		 */
		fw.flush();
		fw.close();
		System.out.println("FileWrite() ----> fileWriter.txt");
		
		FileReader fr = new FileReader("fileWriter.txt");
		/*
		 * 
		 */
		int readChar = fr.read();
		System.out.println("1.readChar:" +(char)readChar);
		readChar = fr.read();
		System.out.println("2.readChar:" +(char)readChar);
		readChar = fr.read();
		System.out.println("3.readChar:" +(char)readChar);
		readChar = fr.read();
		
		int charCount = 0;
		int lineCount = 0;
		int munjaCount = 0;
		while(true) {
			readChar = fr.read();
			if(readChar == -1)break;
			charCount++;
			if(readChar == '\n') {
				lineCount++;
			}
			if(readChar == '인') {
				munjaCount++;
			}
			System.out.println((char)readChar);
		}
		fr.close();
		System.out.println();
		System.out.println(charCount+"문자 읽음");
		System.out.println(lineCount+ "라인 읽음");
		System.out.println(munjaCount+ "개 읽음");
		
	}

}
