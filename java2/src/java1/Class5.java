package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2 mb=new Member2();
		mb.list("홍길동", 5);
		/*
		응용문제 5. Member2 class안에 신규 메소드를 생성하여, 
		다음과 같이 결과가 나올 수 있도록 코드를 작성하시오. 
		단, 사용자가 직접 구구단 숫자를 입력합니다.
		ex)
		 	"사용하실 구구단 숫자를 하나 입력하세요."
		 	[결과] - 해당 구구단 역순으로 출력
		 	4 입력시
		 	4*9=36
		 	4*8=32
		 	...
		 	4*2=8
		 	4*1=4
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("\n사용하실 구구단 숫자를 하나 입력하세요.");
		int g = sc.nextInt();
		sc.close();
		mb.rq(g);
		
		
	}

}

class Member2{
	//일반 메소드는 인자값을 복합적으로 적용할 수 있음
	public void list(String user,int level) {
		System.out.printf("\n고객명:%s 레벨:%d",user,level);
	}
	//응용문제5
	public void rq(int n) {
		int w=9;
		while(w>=1) {
			int sum = n*w;
			System.out.printf("\n%d*%d =%d",n,w,sum);
			
			w--;
		}
		
	}
}