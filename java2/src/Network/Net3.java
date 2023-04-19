package Network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//Crawling 사용법
public class Net3 {

	public static void main(String[] args) {
		try {
			crawling cl = new crawling();
			cl.creak();
		}
		catch(Exception e) {
			System.out.println("통신오류");
		}

	}

}
class crawling{
	Scanner sc=null;
	String url ="";
	URL urls = null;
	InputStream is = null;
	InputStreamReader ir = null;
	public void creak() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL 주소를 입력하세요(파일명 포함)");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		this.is = this.urls.openStream();
		this.ir=new InputStreamReader(this.is);
		BufferedReader br = new BufferedReader(this.ir);
		
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html");
		PrintWriter pw = new PrintWriter(fs);
		String code = "";
		while((code=br.readLine())!=null) {
			pw.write(code);
		}
		fs.flush();
		fs.close();
		this.sc.close();
		pw.close();
	}
}