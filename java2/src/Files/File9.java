package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class File9 {
	// 파일 데이터를 배열로 전송하기(I/O)

	public static void main(String[] args) {
		try{
			filedata fd = new filedata();
			fd.addfile();
		}
		catch(Exception e){
			System.out.println("메소드 호출 오류");
		}
	}

}
class filedata{
	/*
	 라이브러리 : io(기본 input/output만 사용)	
	 		  nio(buffer를 활용하는 input/output - 성능이 더 좋음)
	 
	 
	 Files.readAllLines : 파일 전체의 모든 텍스트라인을 읽어들이는 메소드
	 List(최상위), ArrayList(파생배열) : 일반형식 배열	/List 선언할때는 List<String>생략
	 LinkedList : readLine 사용X, 파일 전체 라인에 대한 배열값으로 적용하지 못함.(배열번호가 없음)
	 */
	FileReader fr = null;
	List<String> data = null;
	
	public void addfile() throws Exception{
		//Paths.get : 파일 경로
		this.data=Files.readAllLines(Paths.get("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"),Charset.forName("UTF8"));
		System.out.print(data);
	}
}