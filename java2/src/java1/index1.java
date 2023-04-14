package java1; //package란 프로젝트 그룹을 말합니다.

public class index1 {	//index1 class명
	//필드 공간(전역변수)
	
	
	/*main 메소드는 java에 기본으로 실행되는 최초의 함수*/
	public static void main(String[] args) {//메소드
		//지역변수
		//변수 선언시 무조건 자료형을 입력받게 됩니다. 
		String a ="홍길동";	//문자 자료형 변수
		int b =10;			//숫자 자료형 변수
		int c= 20;
		int d = b+c;
		System.out.println(a);
		System.out.println(d);
		
		double e = 1.5;	// 소수 자료형 변수
		/*
		 float : 소수점 기준 45개(숫자 뒤에 f입력해야함)
		 double : 소수점 기준 320개
		 */
		System.out.println(e);
		
		long f = 123456789123456789L;	
		//숫자 자료형 중 int로 표현가능한 범위 이상을 이상표현 가능한 자료형(숫자 뒤에 L입력해야함) 
		System.out.println(f);
		/*
		 byte : -128~127
		 short : -32,768 ~ 32,767
		 int : -2,147,483,648 ~ 2,147,483,647
		 long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		*/
		byte aa =127;
		System.out.println(aa);
		

		
		
	}

}
