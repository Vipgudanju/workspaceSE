// 2022-12-12

package client;

import java.net.InetAddress;

public class InternetAddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println(" ---- local address(IP) ----");
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("local host name:" + localAddress.getHostName());
		System.out.println("local host address:" + localAddress.getAddress());
		
		System.out.println(" ---- remote address(IP)");
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println("remote host name:" + remoteAddress.getHostName());
		System.out.println("remote host address:" + remoteAddress.getAddress());
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.google.co.kr");
		for(InetAddress inetAddress : remoteAddresses) {
			System.out.println(inetAddress);
		}
		
	}

}
