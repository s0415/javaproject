package java3;

//예외처리 : I/O(Input & Output) 사용시 필수로 적용하게 됩니다.

//Exception의 큰 틀 try catch finally
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b ="a1";
		try {	//(1).해당 변수값을 숫자로 자료형 변환
			a = Integer.valueOf(b);	//문자 a로 인하여 오류발생 >catch로
			
			//try에서 문제 발생 시 다른 문법이 있어도 실행되지않고 catch로 넘어감(아래 실행X)
			int sum = 10+20;
			System.out.println(sum);
		}
		catch(Exception e) {	//(2):오류발생시 실행되는 문법
			System.out.println("숫자로 변환되지 않습니다.");
			//(3) : 어떤 부분에서 문제가 발생하는지 체크
		}
		finally {	//(4) : try에서 문제가 발생한 사항을 수정 후 재실행
			
			//b = b.replaceAll("[a-z][A-Z]", "");	//Java11
			b = b.replaceAll("[a-zA-Z]", "");	//Java8 (문자제거)
			a = Integer.valueOf(b);	//(5) : 숫자로 변환
		}
		System.out.println(a);	//(6) 최종 결과값 출력

	}

}
