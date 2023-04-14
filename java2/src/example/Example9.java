package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {
	/*
	응용문제4.
	자판기 프로세서 개발이 다음과 같이 작동되도록 코드를 작성합니다.
	"금액을 입력하세요."
	"다음 메뉴를 선택하세요.[콜라,사이다,환타,포카리]"
	"최종 남은 금액은 xxx원 입니다."	
	*/
	String data[][]= {
			{"콜라","사이다","환타","포카리"},
			{"500","500","600","800"}
	};
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Example9 ex=new Example9();
		ex.result();

	}
	public void result() {
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();	//사용자가 입력한 금액
		System.out.println("메뉴를 선택하세요. :"+ Arrays.toString(data[0]));
		String select = sc.next();	//메뉴를 선택한 금액
		int w =0;
		int total=0;	//계산 초기값 변수
		while (w<this.data[0].length) {
			if(select.equals(this.data[0][w])) {
				total = money- Integer.parseInt(this.data[1][w]);
			}
			w++;
		}
		if(total<0) {
			System.out.println("금액이 모자릅니다.");
		}
		else {
			System.out.println("최종 남은 금액은 "+total+"원 입니다.");
			
		}
		

	}
}