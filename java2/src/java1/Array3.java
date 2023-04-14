package java1;

import java.util.Scanner;

public class Array3 {
	//배열응용편
	public static void main(String[] args) {
		String user[]= {"hong","kim","park","jang","han"};
		/*
		응용문제. 사용자가 아이디를 입력합니다.
		"아이디를 입력하세요"
		해당 아이디를 입력 후 동일한 아이디가 있을 경우 "해당아이디를 확인했습니다"
		라는 메세지를 출력, 없을 경우 "미가입자입니다"라고 출력하십시오
		단, 외부 class를 이용하여 제작합니다.
		*/
	    Search sh = new Search();
	    sh.idcheck(user);

	}
}

	class Search{
		   public void idcheck(String data[]) {
		      int ea = data.length;
		      Scanner sc = new Scanner(System.in);
		      //System.out.println("아이디를 입력하세요");
		      String id = sc.next().intern();
		      sc.close();
		      int w = 0;
		      int count = 0;
		      while(w < ea) {
		         if(id == data[w]) {
		            count++;
		         }
		         w++;
		      }
		      if(count==0) {
		        // System.out.println("미가입자입니다.");
		      }
		      else {
		        // System.out.println("해당 아이디를 확인했습니다.");
		      }

		}
}

