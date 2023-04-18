package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

public class File8 {

	public static void main(String[] args) throws Exception {
		// BufferReader (output) - cpu 캐시메모리 임시저장
		// ㄴ사용하는 이유 : 배열의 값을 빠르게 배분하여 활용할 수 있도록 함
		buffer bf = new buffer();
		bf.dataview();
	}
}

class buffer{
	FileReader fr =null;
	BufferedReader br =null;
	public void dataview() throws Exception {
		this.fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		this.br = new BufferedReader(this.fr);
		
		//파일 객체를 한번 인스턴스로 로드함
		this.fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		//LineNumberReader : 새롭게 생성된 객체 인스턴스를 로드합니다.
		LineNumberReader li = new LineNumberReader(this.fr);
		int ea = 0;
		while(li.readLine()!=null) {
			ea = li.getLineNumber();
		}
		System.out.println(ea);
		
		
	    String text = "";
	      while((text=this.br.readLine())!=null) {
	         System.out.println(text);
	      }
		 //System.out.println(this.br.readLine());
		
		/*
		 ***Buffer는 한번 사용시 무조건 다음 라인으로 이동됩니다.
		 조건문에 Buffer의 readLine 사용시 해당 첫번째 라인은 캐시메모리에서 삭제됨
		 ex) 아래 조건문에서 readLine을 사용해서 notice.txt의 첫번째 라인[긴급공지]가 삭제되어
		 	두번째라인 [이벤트]부터 출력됨.
		
		if(this.br.readLine()!=null) {	
			System.out.println(this.br.readLine());
		}
		 */
		
	}
}