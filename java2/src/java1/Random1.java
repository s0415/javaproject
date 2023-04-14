package java1;

import java.util.Scanner;

public class Random1 {
	//random메소드 이용방법 + 재귀메소드
	public static void main(String[] args) {
		/*
		Math.ceil : 올림
		Math.floor : 절삭
		Math.round : 반올림
		*/
		int number = (int)Math.ceil(Math.random()*10);
		double nm = Math.ceil(Math.random()*10);
		System.out.println(number);
		System.out.println(nm);
		
		/*
		 문제. 컴퓨터가 하나의 숫자를 뽑습니다. 
		 사용자가 해당 숫자를 맞추는 게임입니다.
		 단, 틀릴경우 컴퓨터는 다시 다른 숫자를 뽑습니다. 
		 틀릴경우:'실패' 맞을경우:'정답' 호출
		*/
		game g = new game();
		g.pc();
		
		
		
		
	}

}
class game{
	Scanner sc= new Scanner(System.in);
	//this는 해당 클래스 안에서 사용되는 모든것을 지칭합니다. 
	public void pc(){
		//1에서 5까지 pc가 무작위 숫자를 선택함
		int ai = (int)Math.ceil(Math.random()*5);
		System.out.println("1부터 5까지 숫자중 하나를 입력하세요.");
		int put = this.sc.nextInt();
		if(ai==put) {
			System.out.println("정답");
			this.sc.close();
		}
		else {
			System.out.println("실패");
			this.pc(); //재귀함수 : 자신의 메소드를 다시 재호출
		}
	}
}