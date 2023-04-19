package Network;

import java.net.InetAddress;

public class Net1 {
	/*
	 - IPv4 : 192.168.10.144, - IPv6 : fe80::6238:67b3:a066:b77%8
	 - localhost : 자신의 서버 주소를 말함
	 - TCP : IP 형태 통신(속도가 느림) , - UDP : 내부망 형태로 통신(속도가 빠름)
	 */
	
	public static void main(String[] args) {
		try {
			InetAddress ia= InetAddress.getByName("localhost");
			String domain = ia.getHostAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip);
			
			InetAddress ia2[]=InetAddress.getAllByName("naver.com");
			System.out.println(ia2.length);	//naver의 서버가 4개라는뜻
			
			
		}
		catch(Exception e) {
			
		}
		

	}

}
