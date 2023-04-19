package Network;

import java.net.Socket;

public class Net6 {
	//Client 생성
	
	
	public static void main(String[] args) {
		try {
			System.out.println("Client 접속");
			String ip = "192.168.10.143";
			int port =9001;
			Socket sk = new Socket(ip,port);
			System.out.println("서버에 연결 되었습니다.");
			
		}
		catch(Exception e) {
			System.out.println("서버에 접근하지 못합니다.");
		}

	}

}
