package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File15 {
	//파일 처리
	public static void main(String[] args) {
		try {
			//사용자가 한글 이미지 파일명으로 업로드시 영문 파일명으로 변경하여 저장
			
			//한개씩만 실행 가능
			
			//파일 복사 기능
			Path data1 = Paths.get("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
			Path data2 = Paths.get("D:\\git_java\\javaproject\\java2\\src\\Files\\notice2.txt");
			Files.copy(data1,data2);
			
			//파일 이동 기능
			/*
			Path data3 = Paths.get("D:\\git_java\\javaproject\\java2\\src\\Files\\notice2.txt");
			
			Path directory = Paths.get("D:\\memo\\notice2.txt");
			Files.move(data3, directory);
			*/
			
			//파일 삭제
			/*
			Path data4 = Paths.get("D:\\\\memo\\\\notice2.txt");
			Files.delete(data4);
			*/
		}
		catch(Exception e) {
			
		}

	}

}
