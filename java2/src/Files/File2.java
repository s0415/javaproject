package Files;
import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) throws Exception {
		try {
			
			/*
			 ANSI = EUCKR
			 Charset.forName("EUCKR") : 인코딩 언어셋을 변경할 때 사용합니다.
			 단, 출력하는 언어셋의 형태만 바꾸는 명령어이며 파일 자체가 바뀌지 않음.
			*/ 
			
			
		FileReader fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("EUC_KR"));
		System.out.println(fr.getEncoding());	//파일 인코딩 언어 확인
		System.out.println(fr.read());	//데이터 크기
		while(true) {
			int a = fr.read();
			System.out.println((char)a);
			if(a==-1) {	//a가 없을경우..?
				break;
			}
		}
		fr.close();//로드한 파일을 닫을때 사용
		}
		catch (Exception e){
			System.out.println("파일 경로 실패");
		}
		
	}

}
