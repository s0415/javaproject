package java1;

import java.util.Scanner;

public class Class10_answer {
	//로그인 프로세서
	 public static void main(String[] args) {
	      userlogin ul = new userlogin();
	      ul.login();
	   }

	}

	class userlogin{
	   int count = 0; //패스워드 카운팅 (3회 틀릴 경우)
	   Scanner sc = new Scanner(System.in);
	   String msg = "";   //return에서 사용되는 결과값 변수
	   
	   public String pwck(String id) {
	      count++;
	      System.out.println("패스워드를 입력하세요:");
	      String pw = sc.next();
	      if(pw.equals("a123456") && id.equals("hong")) {
	         msg = "yes";
	      }
	      else {
	         if(count < 3) {
	            System.out.println("패스워드가 틀립니다.("+count+")");
	            pwck(id);   //return함수 재호출
	         }
	         else {
	            msg = "no";
	         }
	      }
	      return msg;
	   }
	   
	   public void login() {
	      System.out.println("아이디를 입력하세요:");
	      String id = sc.next();
	      //result : yes :로그인 되었습니다., no : 로그인 실패 10분 후 다시로그인
	      String result = pwck(id);   //패스워드 입력 및 검토
	      if(result.equals("yes")) {
	         System.out.println("로그인 되었습니다.");
	      }
	      else {
	         if(!id.equals("hong")) {
	            System.out.println("가입되지 않은 사용자 입니다.");
	         }
	         else {
	         System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
	         }
	      }

	      sc.close();
	   }
	}