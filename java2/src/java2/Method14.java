package java2;

public class Method14 {
	//boolean 리턴 메소드
	public static void main(String[] args) {
		test1 t= new test1();
		t.info("홍길동", 30);
		boolean result = t.equals(30);
		if(result==false) {
			System.out.println("숫자를 입력하세요");
		}
		else {
			System.out.println("올바른 값입니다.");
		}

	}

}
class test1 extends Object{
	private String name;
	private int age;
	public void info(String n, int a) {	//setter
		this.name=n;
		this.age=a;
	}
	@Override	
	//오버라이드시 인자값 자료형 및 인자값 추가를 하지 못함(본 class의 메소드를 수정해야함.)
	public boolean equals(int z) {	//boolean숫자가 아닌 문자로 들어올 경우
		return super.equals(z);	//문자일 경우 false
	}
}
class Object{
	public boolean equals(int z) {	//같은 클래스의 값을 비교하는 메소드
		return true;	//기본 true(숫자로 들어올 경우는 true 반환
	}
}