package Files;

import java.io.FileReader;
import java.io.IOException;

public class File1 {
	// I/O : InputStream, OutputStream
		/*
		 입력 스트림 : 프로그램으로 들어오는 부분(키보드, 마우스, HDD-저장되는 파일)
		 출력 스트림 : 프로그램으로 나가는 부분(모니터, HDD, 프린터)
		 Stream : API 라이브러리를 사용하는 형태
		 JAVA.io (API)
		 
		 (일반 : File, FileReader) --> StreamAPI (FileinpuStream)
		 (일반 : FileWriter) --> StreamAPI(FileoutputStream)
		*/
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\message.txt");
		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m==-1) {
				break;
			}
		}
		fr.close();

	}

}
