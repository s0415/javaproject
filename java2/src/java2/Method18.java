package java2;

public class Method18 extends data {
	//main은 오버라이드를 사용할 수 없습니다.

	public static void main(String[] args) {
		md m = new md();
		m.display();
		Method18 mh = new Method18();
		mh.name();

	}
	@Override	//원본 method를 그대로 상속받음
	public void name() {
		int aa =10;		//오버로딩 : 기존 method 코드 외에 추가된 코드
		System.out.println(this.abc); //오버로딩
		super.name();
		System.out.println("추가 코드 작성"); //오버로딩
	}

}
class md extends pt{	//pt:Method 17 있는 메소드
	@Override
	public void display() {	//오버라이드실행
		super.display();
	}
}
class data{
	String abc="홍길동";
	public void name() {
		System.out.println("외부 class data 로드");
	}
	
}