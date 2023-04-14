package java1;

import java.util.Scanner;

public class Class7 {
	//응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행

	public static void main(String[] args) {
	//직접풀이
	//Membership m = new Membership();
	
	//선생님풀이
	Ship s = new Ship();
	}
}


//선생님풀이
class Ship{
	public Ship() {
		agree();
	}
	public void agree() {
		String ag1 =inputs("회원가입 약관에 동의하시겠습니까? (y/n) : ","");
		if(ag1.equals("y")) {
			String ag2 =inputs("아이디를 입력하세요","");
			if(ag2.equals("admin")) {
				System.out.println("해당 아이디는 중복되었습니다.");
			}
			else {
				String ag3 = inputs("패스워드를 입력하세요.: ","");
				String ag4 = inputs("가입자명을 입력하세요.: ","y");
				System.out.printf("\n아이디:%s 패스워드:%s 가입자명:%s",ag2,ag3,ag4);
			}
		}
		else {
			System.out.println("회원가입이 취소되었습니다.");
			System.exit(0);
		}
	}
	public String inputs(String msg,String exit) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		if(exit.equals("y")) {
			sc.close();
		}
		return result;
	}
}


/*직접풀이
class Membership{
	public Membership() {
		System.out.println("회원가입 약관에 동의하시겠습니까? (y/n)");
		Scanner ag = new Scanner(System.in);
		String a = ag.next().intern();
		if(a=="y") {
			System.out.println("아이디를 입력하세요.");
			String id = ag.next().intern();
			if(id=="admin") {
				System.out.println("중복된 아이디 입니다.");
				System.exit(0);
			}
			System.out.println("패스워드를 입력하세요.");
			String pw = ag.next();
			System.out.println("가입자명을 입력하세요.");
			String nm = ag.next();
			System.out.println("정상적으로 회원가입이 완료되었습니다.");
		}
		else if(a=="n") {
			System.out.println("회원가입이 취소되었습니다.");
		}
		else {
			System.out.println("y/n 둘 중 하나를 입력하세요.");
		}
		ag.close();
	}
}
*/