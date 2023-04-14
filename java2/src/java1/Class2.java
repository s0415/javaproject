package java1;

class Member{		//외부클래스
	String user = "홍길동";	//인스턴스변수값
	public static void abc() {	//void : return이 없는 method(=void 없으면 return method)
		String user2 = "이순신";
		System.out.println(user2);
	}
}

class Quest{
	int q1=3;
	int q2=3;
}

/*
 [접근 제어자]
 public : 기본으로 필요시 접근이 용이하게 사용(접근 제한이 없음)
 private : 자신의 클래스 내에서만 접근이 됨(같은 패키지 아니어도 가능)
 protected : 같은 패키지 안에서 파생되는 클래스만 접근 가능
 외부 클래스 : default (동일한 패키지만 접근 가능)
*/

public class Class2 {
	//외부 class 및 외부 method활용
	public static void main(String[] args) {
		//public class위에 보조class 사용 가능
		Member m = new Member(); //객체생성
		m.abc();	//Member Class에 abc 메소드를 호출
		
		Inject i = new Inject();	//객체생성
		i.user("hong","a123456");	//인자값으로 해당 메소드 전송
		
		/*
		 응용문제1. 
		 외부 class를 이용하여 2개의 숫자값을 곱합니다. 해당 값이 짝수인지 홀수인지 검토하는 코드를 작성하시오. 
		 */
		Quest f = new Quest();
		if((f.q1)*(f.q2)%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		//응용문제1풀이
		i.multiply(3,7);
		
	}
}


class Inject{
	//user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public static void user(String name,String pw) {
		
		System.out.println("사용자명:"+name+" 패스워드:"+pw);
		
	}
	
	//응용문제1 풀이
	public static void multiply(int a, int b) {
		int sum = a*b;
		if(sum%2==0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}
	
	
}