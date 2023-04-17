package Files;

import java.io.FileWriter;
import java.util.Scanner;

public class File5 {
	//user.txt 라는 파일에 다음과 같이 저장되도록 코드를 작성하시오.
	/*
	 사용자 아이디를 입력하세요.
	 총 5번 질무낳며, 사용자가 직접 입력합니다.
	 사용자가 입력한 내용은 user.txt.에 남아있어야 합니다.
	 */
	public static void main(String[] args) throws Exception {

		//선생님풀이
		FileWriter fw=null;
		Scanner sc=null;
		//true 안쓰는 이유 : 반복문 안에 적용시에만 true필요
		fw = new FileWriter("D:\\\\git_java\\\\javaproject\\\\java2\\\\src\\\\Files\\\\user.txt");
		int w=0;
		while(w<5){
			sc = new Scanner(System.in);
			System.out.println("사용자 아이디를 입력하세요.");
			String id = sc.next();
			fw.write(id+"\n");
			w++;
		}
		fw.close();
		sc.close();
	}
}


/*
		 //내풀이
		FileWriter fw = new FileWriter("D:\\git_java\\javaproject\\java2\\src\\Files\\user.txt");
		Scanner sc = new Scanner(System.in);
		int w=0;
		do {
			System.out.println("사용자 아이디를 입력하세요.");
			fw.write(sc.next()+",");
		w++;
		}while(w<5);

		sc.close();
		fw.close();
	}
}

*/