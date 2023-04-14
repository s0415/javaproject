package java1;

import java.util.Scanner;

public class Class10 {
		//로그인 프로세서
	public static void main(String[] args) {
		Login l = new Login();

	}

}
class Login{
	public Login() {
		System.out.println("아이디를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String id = sc.next().intern();
		if(id=="hong") {
			System.out.println("패스워드를 입력하세요.");
			String pw = sc.next().intern();
			if(pw=="a123456") {
				System.out.println("로그인 되었습니다.");
			}
			else if(pw!="a123456") {
				System.out.println("패스워드가 틀렸습니다. 다시 입력하세요.(입력횟수 2회 남음)");
				String pw2 = sc.next().intern();
				if(pw2=="a123456") {
					System.out.println("로그인 되었습니다.");
				}
				if(pw2!="a123456") {
					System.out.println("패스워드가 틀렸습니다. 다시 입력하세요.(입력횟수 1회 남음)");
					String pw3 = sc.next().intern();
					if(pw3=="a123456") {
						System.out.println("로그인 되었습니다.");
					}
					if(pw3!="a123456") {
						if(pw3=="a123456") {
							System.out.println("로그인 되었습니다.");
						}
						System.out.println("해당 아이디는 10분 후에 다시 로그인 할 수 있습니다.");
					}
				}
			}

		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		sc.close();
	}
}