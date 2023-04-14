package java1;

import java.util.Scanner;

public class index7 {

	public static void main(String[] args) {
		
		//하나의 객체로 여러번 사용하는 형태
		Scanner aa = new Scanner(System.in);
		System.out.printf("Q.입금할 금액을 적어주세요.");
		//int money = aa.nextInt();
		
		System.out.println("\nQ.입금 진행을 하시겠습니까?");
		//String result =aa.next();//동일한 객체를 실행시킴
		System.out.println("입금 완료 되었습니다.");
		
		aa.close();//close():한번 실행시 해당 객체를 더이상 사용하지 못함.
		
		
		

	}

}
