package example;			//그룹에 해당

class korea{		//외부 class
	//외부field공간
	
	public void abc() {		//외부 method(public 생략 가능..private,protected는 생략 불가능)
		
	}
	
}

public class Example1 {		//class는 무조건 생성
	
	//field 공간 : 전역변수 공간(public, private, protected, default)
	private int a=1;
	public int b=2;
	String c= "이순신";	//default
	public String d = "장보고";
	protected int e= 3;
	
	
	public Example1() {		//construct 즉시 실행
		
	}
	

	public static void main(String[] args) {	//프로세서 실행 method
		//단, main method는 1개로 구성

	}
	
	public String abc() {		//문자형 return method
		return null;
	}
	
	public void bbb() {		//일반 확장 method
		String a = "홍길동"; //지역변수
		
	}
	
	public static void ccc() {	//메모리에 저장시키는 일반 확장method
		
	}

}
