package Files;
import java.io.FileReader;

public class File2 {

	public static void main(String[] args) throws Exception {
		try {
		FileReader fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt");
		System.out.println(fr.getEncoding());	//파일 인코딩 언어 확인
		System.out.println(fr.read());	//데이터 크기
		fr.close();//로드한 파일을 닫을때 사용
		}
		catch (Exception e){
			System.out.println("파일 경로 실패");
		}
		
	}

}
