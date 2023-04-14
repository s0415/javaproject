package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		/*
		응용문제3.
		넘버데이터 3 6 9 12 15
		넘버데이터  2 4
		결과 2 3 4 6 9 12 15로 출력 ArrayList로 작성
		*/
		Integer number1[]= {3, 6, 9, 12, 15};
		Integer number2[]= {2,4};
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(number1));
		ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(number2));
		al.addAll(al2);		//addAll : ArrayList에 있는 모든 값을 기존 배열로 추가
		Collections.sort(al);
		System.out.println(al);
		
		
	/*
		//내풀이
		ArrayList<Integer> aaa = new ArrayList<>(Arrays.asList(number1));
		//System.out.println(aaa);
		aaa.add(number2[0]);
		aaa.add(number2[1]);
		Collections.sort(aaa);
		System.out.println(aaa);
	*/
		
		//무한루프
		Scanner sc= new Scanner(System.in);
		while(true) {	//무한루프 사용 형태(while문, do-while문에서만 사용  //for문 사용X)
			System.out.println("숫자를 입력하세요.");
			int no= sc.nextInt();
			if(no==10) {	//사용자가 숫자 10을 입력하면 무한루프 종료
				System.out.println("종료합니다.");
				break;
			}
		}
		sc.close();
	}

}
