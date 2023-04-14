package java1;

import java.util.Scanner;

public class index10 {
	//for문+scanner

	public static void main(String[] args) {
		/*
		 응용문제2.
		 Q. 원하는 구구단 숫자를 입력하세요.
		    사용자가 원하는 숫자를 입력하면 해당 숫자에 맞는 구구단이 출력되도록 하시오.
		    ex)3을 입력할 경우 구구단 3*1=3부터 3*9=27까지 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단 숫자를 입력하세요.");
		int a=sc.nextInt();
		
		int b;
		int c;
			for(b=1;b<=9; b++) {
				c=a*b;
				System.out.printf("\n%d*%d = %d",a,b,c);
				//System.out.printf("%d*%d =%d\n",a,b,(a*b));
				sc.close();	//close는 반복문 밑에 쓸 수 없음
			}
		
	}

}
