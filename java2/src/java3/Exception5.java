package java3;
//예외처리시 잘못 호출되는 경우
public class Exception5 {

	public static void main(String[] args) {
		ex2 e = new ex2();
		try {
			e.loader("ok");
		}
		catch (Exception aa) {
			if(aa.getMessage()!=null) {
				System.out.println(aa);
			}
		}

	}

}

class ex2{
	public void loader(String a) throws Exception{
		/*
		 해당 메소드에서 오류가 발생시 모든 내용이 자신을 호출한 본 class에게 전달되어집니다.
		 >throws때문에
		 자신의 문제사항을 직접 확인 하는 방법은 자신의 메소드에도 try-catch를 사용해야만 확인 가능합니다.
		*/
		try {
			if(a=="ok") {
				String data = "1,000";
				int money =Integer.valueOf(data);
				}
			else {
				System.out.println("데이터가 잘못 전달됨");
				}
		}
		catch (Exception e){	
			//money가 숫자로 변환 실패일 경우 자신의 코드에 어떤 문자가 발생했는지 확인하게 됨
			System.out.println(e.getMessage());
			Exception ep = new Exception();
			throw ep;
		}
		
	}
}