package Network;
	
//*PrintWriter 사용하지 않고 Buffered이용해 출력 (Net3과 내용동일)

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Net4 {

	public static void main(String[] args) {
		try {
			crawling2 cl = new crawling2();
			cl.creak();
		}
		catch(Exception e) {
			System.out.println("통신오류");
		}

	}

}
class crawling2{
	Scanner sc=null;
	String url ="";
	URL urls = null;
	InputStream is = null;
	BufferedInputStream bs = null;
	
	public void creak() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL 주소를 입력하세요(파일명 포함)");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		

		this.is = this.urls.openStream();
		this.bs =new BufferedInputStream(this.is);
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("D:\\memo\\test.html");
		int z=0;
		while((z=this.bs.read(code))!=-1) {
			fs.write(code,0,z);
		}
		this.bs.close();
		fs.flush();
		fs.close();
		System.out.println("크롤링 완료되었습니다.");
	}
}