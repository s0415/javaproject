package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅클라이언트
	public static void main(String[] args) {
		multi_client mc = new multi_client();
		mc.info();

	}
	public void info() {
		Socket sk = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader isr = null;
		Scanner sc = null;
		try {
			//서버 접속 ip 및 포트 설정
			sk = new Socket("192.168.10.144",10001);
			System.out.println("Connect Success");
			sc = new Scanner(System.in);
			System.out.println("user id : ");	//사용자 아이디
			String name = sc.next();
			
			//멀티스레드로 사용자 아이디 및 소켓 전달
			Thread tr = new ch_client(sk,name);
			tr.start();	//멀티스레드 가동
			
			is = sk.getInputStream();		//읽기
			isr = new InputStreamReader(is);	//byte->String 변환
			br = new BufferedReader(isr);		//메모리에 저장
			
			while(br!=null) {
				String msg = br.readLine();	//메모리 문자 확인
				System.out.println(msg);	//전달
			}
		}
		catch(Exception e) {
			System.out.println("Server Connect Error...");
		}	
	}
}

class ch_client extends Thread{
	Socket sk = null;
	String name = null;
	Scanner sc = null;
	
	//소켓, 아이디값 기본설정으로 등록
	public ch_client(Socket s, String name) {	//setter
		this.sk=s;
		this.name=name;
	}
	@Override
	public void run() {
		try {
			//byte->String 변환
			PrintWriter ps = new PrintWriter(this.sk.getOutputStream());
			ps.println(this.name);	//입장시에만 (첫 1회)
			ps.flush();
			
			while(true) {		//사용자가 입력하는 메세지를 전달
				this.sc =  new Scanner(System.in);
				String msg = this.sc.nextLine();
				ps.println(msg);	//전달 메세지 출력
				ps.flush();			//메세지 초기화
				if(msg.equals("exit")) {
					System.out.println("chatting end..");
					System.exit(0);	//프로세서 종료
					this.sc.close();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Message Error!");
		}
	
	}
}