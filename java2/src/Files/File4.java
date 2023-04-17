package Files;

import java.io.FileWriter;

public class File4 {

	//배열 파일로 정리
	public static void main(String[] args) throws Exception {	
		
		//FileWriter : 문자 데이터를 파일에 쓰는 class
		
		String userdata[]= {"hong","kim","park","jang","kang"};
		FileWriter fw = new FileWriter("D:\\git_java\\javaproject\\java2\\src\\Files\\message2.txt");
		//FileWriter에 true를 붙이게 되면, 기존 입력된 사항을 유지하면서 추가데이터가 입력됨
		int w=0;
		do {
			fw.write(userdata[w]);	//write : 문자, 배열, 숫자 등 다양한 데이터값을 파일에 저장하는 명렁어
			w++;
		}while(w<userdata.length);
		fw.close();
	}

}
