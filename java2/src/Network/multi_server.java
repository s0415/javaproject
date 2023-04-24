package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class multi_server {
	//멀티채팅서버
	public static void main(String[] args) {
		Socket sk = null;
		int port = 10001;
		
		try {
		ServerSocket server = new ServerSocket(port);
			while(true) {
				System.out.println("Chatting room Start");
				sk = server.accept();
			}
		}
		catch(Exception e){
			System.out.println("PORT ERROR");
		}
		
	}

}

class ch_server extends Thread{
	
	InputStream is=null;
	OutputStream os = null;
	Socket sk = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	
	static ArrayList<PrintWriter> al=new ArrayList<>();
	
	
	public ch_server(Socket s) {
		this.sk =s;
		try {
			this.os = this.sk.getOutputStream();
			this.pw = new PrintWriter(this.os);
			al.add(this.pw);
			this.is = this.sk.getInputStream();
			this.isr = new InputStreamReader(this.is);
			this.br = new BufferedReader(this.isr);
		}
		catch(Exception e) {
			System.out.println("Server Reader Error");
		}
	}
	@Override
	public void run() {
		String name = "";
		try {
			name = this.br.readLine();
			System.out.println("["+name+"]");
			alluser("["+name+"] Welcome");
		}
		catch(Exception e) {
			System.out.println("Client Error");
		}
	
	}
	public void alluser(String z) {
		for(PrintWriter p : al) {
			p.println(p);
			p.flush();
		}
	}
}