package java1;

import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		
		//System.in : 입력 System.out.println(출력)
		
		//new : 객체 선언을 말함.
		Scanner abc = new Scanner(System.in);	//사용자가 직접 값을 입력하는 도구 
		
		int a= 10;//비교숫자
		
		//print, printf :출력라인이 같은 라인으로 출력됨
		//println : br과 같이 한줄 아래에 출력됨
		System.out.println("사용자가 원하는 숫자를 입력하세요");
		
		int b=abc.nextInt();	//사용자 입력값울 숫자값으로 받음
		//String b=abc.next(); //사용자 입력값을 문자값으로 받음
		if(a>b) {
			System.out.println("업");
		}
		else if(a<b) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답입니다.");
		}
		abc.close();	//Scanner를 사용 후 종료 선언을 해야 함.
	}

}
