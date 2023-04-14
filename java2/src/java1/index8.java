package java1;

import java.util.Scanner;

public class index8 {

	// Scanner와 문자열 비교
	public static void main(String[] args) {
		//equals = "=="(같다)
		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		//intern() : 문자에 한해서 조건문에 equals를 사용하지않고 연산자 기호로 처리할 때 사용
		//조건연산자 기호로 처리할때 사용
		String mid = a.next().intern();
		
		//if(mid.equals("kim") ||mid.equals("park"));
		if(mid=="kim"||mid=="park") {
			System.out.println("회원이 확인되었습니다.");
		}
		else {
			System.out.println("비회원 입니다.");
			}
		//a.close();

		/*
		응용문제 1.
		사용자가 원하는 숫자를 입력합니다. 단, 해당 숫자가 100이하 숫자만 입력해야 하며, 
		100 초과일 경우 "숫자는 100까지만 입력 가능합니다." 라는 메세지가 출력되도록 제작하시오. 
		-추가-
		사용자가 입력한 값이 짝수인지 홀수인지를 출력하시오.
		*/
		Scanner b = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요.");
		int n = b.nextInt();
		
		if(n>100) {
			System.out.println("숫자는 100까지만 입력 가능합니다.");
		}
		else {
			if(n%2==0) {
				System.out.printf("%d는 짝수입니다.",n);
			}
			else {
				System.out.printf("%d는 홀수입니다.",n);
			}
		}
		a.close();	//close는 항상 제일 아래에 있어야함
		b.close();
	}

}
