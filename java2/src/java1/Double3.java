package java1;


import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		/*
		응용문제7.
		사용자가 숫자 3개를 입력합니다. 
		3개의 숫자 중 짝수에 대한 숫자만 곱하여 결과값을 출력합니다.  
		단, 입력한 값 중 짝수가 한개 또는 없을경우 "짝수의 숫자가 확인되지 않습니다" 라는 메세지를 출력
		*/
		
		
	      Scanner sc = new Scanner(System.in);
	      int w = 1;
	      int f = 1;   //모든 숫자를 전체 곱한 합계 변수
	      int v = 0; //짝수 갯수 확인
	      while(w<4) {         
	         System.out.println("숫자 3개를 입력하세요");
	         int a = sc.nextInt();
	         if(a%2==0) {   //사용자가 입력한 값이 짝수값 조건확인
	         v++;   //짝수가 맞을 경우 +1 증가(카운팅)
	         f *= a;      //짝수값일 경우 지속적으로 곱하기
	      }
	         w++;
	      }
	      if(v<2) {   //짝수값이 2개 미만일 경우
	         System.out.println("짝수의 숫자가 확인되지 않습니다.");
	      }
	      else {   //짝수값이 2개 이상일 경우
	         System.out.println("최종합계:"+f);
	      }
	      
	      sc.close();
	   }

	}