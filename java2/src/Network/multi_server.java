package Network;

import java.net.ServerSocket;
import java.net.Socket;

public class multi_server {

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
