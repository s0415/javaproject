package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

//Thread를 이용한 멀티채팅 서버
public class Multi_server {

	public static void main(String[] args) {
		chatroom cr = new chatroom();
	}
}


class chatroom{
	
	static final int port = 10001;
	ServerSocket sk = null;
	Socket so =null;
	
	public chatroom() {
		try {
			this.sk = new ServerSocket(this.port);
			System.out.println("******CHATTING******");
			while(true) {
				this.so=this.sk.accept();	//클라이언트 접속허가
				Thread tr = new chat_thread(this.so);	//accept 전송
				tr.start();
			}
		}
		catch (Exception e) {
			System.out.println("Port Error!!");
		}
	}
}
class chat_thread extends Thread{
	InputStream is = null;
	OutputStream os = null;
	private String msg="";
	Scanner sc = null;
	//배열을 메모리에 저장시키는 이유 : 접속자를 누적시키기 위함
	static ArrayList<Socket> user = new ArrayList<Socket>();
	
	public chat_thread(Socket s){	//즉시실행
		try {
			//System.out.println("Chatting Room open!");
			this.user.add(s);
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			//System.out.println(this.user);
		}
		catch(Exception e) {
			System.out.println("Client Exit Error!");
		}
	}
	@Override
	public void run() {
	 try {
		 byte data[]=new byte[1024];
		 int n = this.is.read(data);
		 this.msg = new String(data,0,n);
		 System.out.println(this.msg);
		 while(true) {
			 this.sc = new Scanner(System.in);
			 System.out.println("message : ");
		 }
	 }
	 catch(Exception e){
		 System.out.println("Client Success Exit");
	 }
		
	}
}