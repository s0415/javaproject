package Network;

import java.io.InputStream;
import java.io.OutputStream;
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
				
				//accept : 클라이언트가 들어오는것을 대기하는 역할? ?
				Socket sc = ss.accept();	//대기
				
				//클라이언트가 접속했을 경우 해당 라인을 시작합니다.
				//접속완료
				System.out.println("호스트 : 통신 연결 성공");
				
				//서버에서 클라이언트로 받는 통로
				InputStream is = sc.getInputStream();
				
				//클라이언트로 보내는 통로
				OutputStream os = sc.getOutputStream();
				
				//클라이언트에서 받는 텍스트를 byte로 받음
				byte data[] = new byte[1024];
				int n = is.read(data);	//해당값을 읽어들임
				
				String msgclient = new String(data,0,n);//문자자료형 변환
				System.out.println(msgclient);	//출력
				
				//클라이언트로 메세지전송
				String aws ="반갑습니다.뿡";	//서버에서 보내는메세지
				os.write(aws.getBytes());	//클라이언트로 보내기위한 메모리저장
				
				os.flush();
				os.close();
				is.close();
				sc.close();
				
			}
		}
		catch(Exception e){
			System.out.println("Server Connect Error!!");
		}
	}

}
