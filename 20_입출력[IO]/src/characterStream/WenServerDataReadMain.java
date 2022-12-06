// 2022-12-06
package characterStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WenServerDataReadMain {

	public static void main(String[] args) throws Exception{
		/**************** html(text) ******************/
		URL urlStr =  new URL("https://youimg1.tripcdn.com/target/10040m000000de6t4F9F7_D_760_506.jpg");
		InputStream in = urlStr.openStream();
		FileOutputStream fout = new FileOutputStream("image.jpg");
		while(true) {
			int readByte = in.read();
			if(readByte == -1)break;
			fout.write(readByte);
			//System.out.print((char)readByte);
		}
		
		in.close();
		fout.close();
		

	}

}
