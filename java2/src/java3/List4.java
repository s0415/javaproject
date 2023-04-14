package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	//무한루프로 배열 코드 연계
	public static void main(String[] args) {
		//for(;;) {} //for문으로 무한루프
		
		//무한루프 사용하는 이유는 : DB의 갯수를 전체적으로 반복시키기 위해서 사용
		Scanner sc = new Scanner(System.in);
		//빈배열
		ArrayList<Integer> al = new ArrayList<>();	//빈배열 (숫자만)
		Integer no;	//사용자가 입력한 숫자값을 저장하는 변수
		while(true) {
			System.out.println("숫자를 입력해 주세요?");
			no = sc.nextInt();
			al.add(no);	//빈배열에 순차적으로 데이터를 입력시킴
			int ea = al.size();	//배열의 크기를 반복적으로 확인
			if(ea > 10) {	//배열의 크기가 10개 이상일 때 
				break;	//반복문 강제 정지
			}
		}
		System.out.println(al);
		sc.close();
	}

}
