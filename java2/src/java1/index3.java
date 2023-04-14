package java1;

public class index3 {

	public static void main(String[] args) {
		//if문
		//+,-,*,/ : 사칙연산 javascript와 같음
		int a,b;
		a=10;
		b=20;
		if(a<b) {
			System.out.println("b값이 큽니다.");
		}
		else if(a>b) {
			System.out.println("a값이 큽니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}

		/*
		 응용문제1.
		 1번 항목은 숫자 10,9,22 이며,
		 2번 항목의 숫자는 19,10,2 입니다.
		 첫번째, 두번째 숫자는 더하며, 세번째 숫자는 곱할경우 결과값이 작은 항목이 출력되도록 하시오.
		 */
		int aa=10+9*22;
		int bb=19+10*2;
		
		if(aa<bb) {
			System.out.println("1번 항목 결과가 작습니다.");
		}
		else if(aa>bb) {
			System.out.println("2번 항목 결과가 작습니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		
		String userid = "hong";
		String userpw = "a123456";
		if(userid=="hong" && userpw =="a123456") {
			System.out.println("로그인 되셨습니다.");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
		
		//정수에서 소수점 결과를 출력하는 경우
		int a1=103; 
		double a2=a1/(double)3;
		System.out.println(a2);
		
		/*
		 Integer : 매개체에 대한 속성 
		 	.toString() : 문자열 변환
		 	.parseInt() or valueOf() : 문자를 숫자로 변환
		*/
		
		//숫자를 문자로 변환하여 출력하는 경우
		int b1=500;
		String b2 = Integer.toString(b1);
		System.out.println(b2);
		
		//문자를 숫자로 변환하여 출력하는 경우
		String c1 = "600";
		int d1 =10;
		//int sum = Integer.valueOf(c1)+d1;
		int sum = Integer.parseInt(c1)+d1;
		System.out.println(sum);
		
		//증가(++), 감소(--)
		int z = 10;
		z++;
		System.out.println(z);
		
		//+=,-=,*=,/=
		int k =50;
		k = k+50;
		//k += k;
		System.out.println(k);
		
		//간단 문자 표현(char - ',' 와 적용해야 함/","안됨!!)
		char f = 'Y';
		System.out.println(f);
		
		
	}

}
