package java3;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception2 ex = new Exception2();
			String data = "3000a";	//(1)문자열 데이터 입력
			ex.test(data);	//(2)외부 메소드로 값을 전달
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("문제발생");
		}
	}
	//throws는 main 메소드에서 예외처리 없이 해당 메소드를 호출할 경우를 막기 위해서 사용
	public void test(String b) throws Exception {	//(4)
		int k = Integer.valueOf(b);
		//System.out.println(k);
		Exception c = new Exception();
		throw c; 
		/*
		 throw : 코드의 가장 아래 사용, return과 비슷한 성격을 가지고 있음.
				 예외처리 결과에 대한 값을 main 메소드로 다시 return시킴
		 */
	}

}
