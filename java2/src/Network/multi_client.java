package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅클라이언트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user id : ");
		String mid = sc.nextLine().intern();
		if(mid=="") {
			System.out.println("id error");
		}
		else {
			ch_client cc = new ch_client(mid);
			cc.start();
		}
	}
}
class ch_client extends Thread{
	private String ip = "192.168.10.144";
	private int port=10001;
	Socket sk = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	String id = null;
	PrintStream ps = null;
	
	public ch_client(String id) {
		try {
			this.id = id;
			this.sk=new Socket(this.ip,this.port);
			System.out.println("Server Connect");
			this.is = this.sk.getInputStream();
			this.isr=new InputStreamReader(this.is);
			this.br= new BufferedReader(this.isr);
			this.os = this.sk.getOutputStream();
			
			while(true) {
				String inputmsg = this.br.readLine();
				System.out.println("message : "+inputmsg);
			}
		}
		catch(Exception e) {
			System.out.println("Server Connect Error");
		}
	}
	@Override
	public void run() {
		try {
			//접속 아이디를 서버로 전송(1회 작동)
			this.ps = new PrintStream(this.os);
			this.ps.println(this.id);
			this.ps.flush();
			
			//채팅 문구를 전송
			while(true) {
				this.sc=new Scanner(System.in);
				String output = this.sc.nextLine();
				this.ps.println(output);
				this.ps.flush();
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}