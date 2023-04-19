package Network;

import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {

	public static void main(String[] args) {
		//socket 통신 : Server, Client 양방향
		//HTTP 통신 : Image,동영상, 음악사용자(요청)에 맞춰서 송수신 통신(단방향)
		
		//양방향 : 자동업데이트
		System.out.println("Server Connect");
		int port = 9001;	//포트번호 셋팅
		try {
			ServerSocket ss= new ServerSocket(port);	//오픈시킬 포트 적용
			while(true) {
				System.out.println("연결 대기중 ... ");
				Socket sc = ss.accept();	//accept : 클라이언트가 들어오는것을 대기하는 역할? ?
				System.out.println("호스트 : 통신 연결 성공");
			}
		}
		catch(Exception e){
			System.out.println("Server Connect Error!!");
		}
	}

}
