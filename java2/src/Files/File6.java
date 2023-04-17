package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) {
		notice n = new notice();
		try {
		n.view();
		}
		catch(Exception e){
			System.out.println("메소드 함수 오류");
		}
	}

}
class notice{
	FileReader fr=null;
	Scanner sc = null;
	public void view() throws Exception {
		this.fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		//해당 Scanner에 파일내용을 모두 적용시킴
		this.sc = new Scanner(this.fr);
		
		//Scanner가 true일경우(파일에 사용된 라인 갯수만큼 반복)에만 반복문 시행, 없으면 false가됨(반복문종료)
		while(this.sc.hasNext()) {	
		System.out.println(this.sc.nextLine());
		}
		this.fr.close();
		this.sc.close();
	}
}