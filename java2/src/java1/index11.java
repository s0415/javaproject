package java1;

import java.util.Scanner;

public class index11 {
	//while, do-while문
	public static void main(String[] args) {
		
		//while문
		int a =1;
		while(a<10) {
			//System.out.println(a);
			a++;
		}
		
		//do-while문
		int b=1;
		do {
			//System.out.println(b);
			b++;
		}while(b<10);

		
		/*
		응용문제3.
		사용자가 두개의 숫자를 입력합니다. 두 숫자의 범위에 있는 모든 값을 더하는 코드를 작성하시오.
		ex) 10 15 
			10+11+12+13+14+15 : 결과값 출력
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하세요.");
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		int sum=0;
		sc.close();
		while(aa<=bb) {
			sum+=aa;
			aa++;
		}
		System.out.printf("최종 결과값은 %d 입니다.",sum);
		
		
		
	}

}
