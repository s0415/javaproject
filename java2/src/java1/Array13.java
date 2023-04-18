package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {
	//사용자 아이디 입력 및 배열 데이터로 변환
	public static void main(String[] args) {
		String lists ="";
		Scanner sc= new Scanner(System.in);
		int f;
		/*
		반복문 없이 사용 시 nextLine
		
		String id=sc.nextLine();
		lists=id;
		*/
			for(f=0; f<=4; f++) {
			System.out.println("학급 학생 아이디를 입력해 주세요");
			String id = sc.next();
			sc.close();	//지워야 작동함
			lists+=id+" ";
		}
		System.out.println(lists);
		//split :문자열 또는 숫자열을 특정 문자 기준으로 배열화 하는 명령어
		String userdata[]=lists.split(" ");
		sc.close();
		System.out.println(Arrays.toString(userdata));

	}
}
