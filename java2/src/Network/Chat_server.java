package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_server {
	//채팅서버
	public static void main(String[] args) {
		
		chat_sv cs = new chat_sv();
		cs.chatserver();
	}

}
class chat_sv{
	private int port=10001;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	public void chatserver() {
		try {
			this.sk=new ServerSocket(this.port);
			this.sc=new Scanner(System.in);
			System.out.println("Login ID : ");	//채팅방 개설자 아이디
			this.mid = sc.next();
			System.out.println("Chatting Room Open");
			while(true) {
				this.so = sk.accept();
				this.is = this.so.getInputStream();		//클라이언트에게 받는 메세지
				this.os = this.so.getOutputStream();	//클라이언트에게 보내는 메세지
			}
		}
		catch(Exception e) {
			System.out.println("Port Connect Error!");
		}
		
	}
}