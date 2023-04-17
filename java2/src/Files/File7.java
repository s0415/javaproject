package Files;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		/*
		 member.txt의 문자 데이터를 
		 ArrayList or List or LinkedList or Map등 다양한 방식으로
		 배열화 하여 배열형식으로 출력되도록 작성
		 예시)
		 [홍길동, 30, hong@nate.com, 서울시, 5000]
		 [강감찬, 25, kang@gmail.com, 강원도, 4500]
		 */
		membertxt mt = new membertxt();
		try {
		mt.view();
		}
		catch(Exception e) {
			System.out.println("오류");
		}
	}

}
class membertxt{
	FileReader fr=null;
	Scanner sc = null;
	public void view() throws Exception{
		this.fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		
		while(this.sc.hasNext()) {
			System.out.println(Arrays.toString(this.sc.nextLine().split(",")));
		}
		this.fr.close();
		this.sc.close();
	}
}