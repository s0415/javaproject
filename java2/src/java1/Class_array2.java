package java1;

import java.util.Scanner;

public class Class_array2 {
	//2개의 배열값 - scoring.java연계
	/*
	응용문제2. "검색하고자 하는 이름을 적어주세요." 출력
	검색어에 이순신 검색시 "이순신님은 80점입니다."라고 출력되게 합니다.
	단, scoring에서는 해당 배열에있는 데이터를 검색하는 용도로만 사용되도록 합니다.
	*/
	public static void main(String[] args) {
		String a1[]= {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[]= {"100","80","39","42","55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요 : ");
		
		String id=sc.next();	//사용자 입력 단어
		scoring a = new scoring();	//외부 class객체 생성
		a.search(a1,a2,id);	//해당 메소드로 3개의 인자값 전달
		sc.close();

	}

}
