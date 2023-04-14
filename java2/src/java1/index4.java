package java1;

public class index4 {

	public static void main(String[] args) {
		
		//반복문 사용(for 문)
		int f;
		for(f=1; f<=10; f++) {
			System.out.println(f);
		}
		
		
		//더블for문
		int a,b;
		for(a=2; a<10; a++) {
			for(b=1; b<10; b++) {
				//System.out.printf("%d\n",(a*b));
				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		
		/*
		응용문제2.
		45~60 숫자를 총 합산한 결과값을 출력하시오 
		*/
		int q;
		int qq=0;
		for(q=45; q<=60; q++) {
			qq+=q;
		}
		System.out.printf("%d\n",qq);
		System.out.println(qq);
		
		
		/*
		 응용문제3.
		 숫자 1~200중 홀수값만 모두 더한 결과값을 출력하시오.
		 */
		int e;
		int ee=0;
		for(e=1; e<=200; e++) {
			if(e%2==1) {
				ee+=e;
			}
		}
		System.out.println(ee);
		
		
		/*
		 응용문제4.
		 숫자 20~60 중 3의 배수값만 모두 더한 후 짝수인지 홀수인지 출력하시오. 
		 */
		int t;
		int tt=0;
		for(t=20; t<=60; t++) {
			if(t%3==0) {
				tt+=t;
			}
		}
		if(tt%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		/*
		 응용문제5.
		 구구단 7단부터 3단까지 역순으로 출력되게 합니다.
		 단, 구구단 결과값중 홀수인 값만 출력되도록 합니다.
		 */
		int p; 
		int pp;
		for(p=7; p>=3; p--) {
			for(pp=1; pp<10; pp++) {
				if(p*pp%2==1) {
				System.out.printf("%d*%d=%d\n",p,pp,(p*pp));
					}
				}
			}

		
		
		
		
		
		
	}	
}
