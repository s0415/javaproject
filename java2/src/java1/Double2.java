package java1;

public class Double2 {

	public static void main(String[] args) {
		/*
		 응용문제6.
		 구구단 9단 중 9*64 까지 숫자 중 
		 홀수값에 대한 평균값 결과를 출력하시오.
		 */

		int a;
		int sum=0;
		int c;
		int d=0;
		for(a=1; a<=64; a++) {
			c=9*a;
			//System.out.println(c);
			if(c%2==1) {
				d+=c;
				sum++;
			}
		}
		System.out.println(d/sum);
		
	
	}
}
