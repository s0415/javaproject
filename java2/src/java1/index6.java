package java1;

import java.util.Scanner;

//Scanner class 활용법

public class index6 {

	public static void main(String[] args) {
		
		//숫자형태의 scanner
		Scanner a = new Scanner(System.in);	//js의 input
		System.out.println("Q.당신의 나이는?");	//placeholder
		int age =a.nextInt();	//int와 scanner 변수 겹치면 안됨
		System.out.printf("입력하신 나이는 %d 입니다.",age);
		
		//문자형태의 scanner
		Scanner b = new Scanner(System.in);
		System.out.println("\nQ. 당신의 성함은?");	//\n: Q.에 엔터 추가하기 위해서 추가함
		String name=b.next();
		System.out.printf("고객명 : %s입니다.",name);
		
		
		//scanner종료
		a.close();
		b.close();
	}

}
