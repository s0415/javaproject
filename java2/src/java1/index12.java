package java1;

import java.math.BigInteger;//BigInteger class 로드

public class index12 {
	//Big loop값 설정
	public static void main(String[] args) {
		//1부터 100까지의 모든 숫자를 곱하여 최종결과값을 출력하시오.
		
		int w =1;
		//long sum =1;
		BigInteger sum=new BigInteger("1");
		/*
		BigInteger : java에서 유일하게 무한의 값을 가질 수 있는 자료형
			단, 변수값의 최초값은 무조건 문자""로 설정
		 */
		while(w<=100) {
			/*
			 add : 사칙연산 '+'
			 subtract : 사칙연산 '-'
			 multiply : 사칙연산 '*'
			 divide : 사칙연산 '/'
			 */
			sum=sum.multiply(BigInteger.valueOf(w));
			//valueOf : 문자를 숫자로 변환
			w++;
		}
		System.out.println(sum);

	}

}
