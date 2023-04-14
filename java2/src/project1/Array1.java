package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		//ArrayList 배열 문자, 숫자 혼합 사용하기
		String data[]= {"hong","park"};	//문자열배열
		int data2[]= {10,20};	//숫자열배열
		//현재 배열 자료형이 2가지 입니다.
		
		//단, ArrayList의 자료형이 String이므로 int 배열은 받지 못함
		//해당 방식은 Object 자료형을 사용합니다
		
		/*
			Object란? 문자, 숫자 자료형과 관계없이 모든 자료형을 다 출력하는 자료형 구조 입니다.
		
		*/
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		
		
		//계산 방식 1
		//int sum = (int)li.get(2) + (int)li.get(3);
		//System.out.println(sum);
		
		//계산방식2
		//Object sum = (int)li.get(2)+(int)li.get(3);
		//System.out.println(sum);
		
		//계산방식 3
		Integer sum=(Integer)li.get(2)+(Integer)li.get(3);
		System.out.println(sum);
		
		/*
		 추가로 ArrayList안의 데이터가 어떤 자료형인지 알아내는 방법(Object)일경우
		 
		 Object는 한 가지 자료형만 받는 형태가 아니다보니
		 .getClass() .getName()을 이용하여 해당 데이터감 문자인지 숫자인지를 파악해야 합니다.
		 */
		
		

	}

}
