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
//PrintWriter 사용하여 출력
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
		
		this.is = this.urls.openStream();	//통신에는 openStream만 사용, 그 외의 Stream 사용X
		
		this.ir=new InputStreamReader(this.is);	//url 소스파일 읽기
		BufferedReader br = new BufferedReader(this.ir);	//읽은 소스파일을 메모리에 탑재(저장
		//파일명생성
		FileOutputStream fs = new FileOutputStream("D:\\memo\\test.html",true);	

		
		//*PrintWriter 사용하지 않고 출력 : Net4
		PrintWriter pw = new PrintWriter(fs);	//write에 String사용 위해서 출력을 문자화하여 사용
		String code = "";	
		while((code=br.readLine())!=null) {
			pw.write(code);	//write에 String으로 사용
		}
		
		fs.flush();
		fs.close();
		this.sc.close();
		pw.close();
		System.out.println("크롤링이 모두 완료되었습니다.");
	}
}