package java1;

public class Class6 {
	//상수 선언 하는 방법 + 외부클래스 기본 메소드 이동
	
	public static void main(String[] args) {
		int a =5;
		final int b=10;			//final : 상수를 선언하는 자료형
		a =10;
		System.out.println(a);
		System.out.println(b);
		
		String id="hong";
		User u = new User(id);	//객체 생성 및 인자값으로 전달

	}

}
class User{
	String person;	//필드에 있는 인스턴스 변수(전역변수)
	
	public User(String id){	//기본 메소드(즉시 실행 메소드) : 무조건 class명과 동일
		person = "홍길동";	//인스턴스 변수의 값을 이관
		System.out.println(id);
		list();	//메소드 바로 호출이 가능함
	}
	public void list() {	//즉시 실행 메소드에서 실행되는 메소드
		System.out.println(person);
		System.out.println("사용자 리스트 출력");
		int p = point();	//return메소드로 값을 이관받아서 처리
		System.out.println(p+" 포인트");
	}
	public int point() {
		return 5000;
	}
}