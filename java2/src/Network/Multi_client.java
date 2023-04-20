package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Thread를 이용한 멀티채팅 클라이언트
public class Multi_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("user id : ");
		String mid = sc.nextLine().intern();
		if(mid=="") {
			System.out.println("id error");
		}
		else {
		mchat m = new mchat(mid);
		}
	}

}
class mchat{
	private String ip ="192.168.10.144";
	private int port =10001;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String msg ="";	//메세지출력

		
	public mchat(String id) {
		try {				this.so = new Socket(this.ip, this.port);
			this.is = this.so.getInputStream();
			this.os = this.so.getOutputStream();
			this.sc = new Scanner(System.in);
			this.msg = "Welcome, "+id;
			this.os.write(this.msg.getBytes());
		}
		
		catch(Exception e){
			System.out.println("Server Connect Error!");			
		}
	}
}