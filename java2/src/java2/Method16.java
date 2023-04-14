package java2;

public class Method16 {
	//클래스 안의 클래스

	public static void main(String[] args) {
		green g = new green();	//부모 class 인스턴스 생성
		g.setter(10,20);
		green.blue gb =g.new blue();	//부모 class안에 자식class 인스턴스 생성
		gb.print();	//자식클래스 안의 method 실행
	}
}
class green{		//부모class
	int aa,bb;
	String name = "홍길동";
	String userage;	//자식 클래스에 있는 값을 setter로 사용하는 변수
	public void setter(int a, int b) {
		this.aa=a;
		this.bb=b;
	      /*
	      green g = new green();
	      System.out.println(gb.age);   //자식 클래스에 있는 값을 가져올때
	      */

	}
	public void pt() {
		System.out.println(this.userage);	//자식 data값 출력
	}
	class blue{		//자식class
		int a1=green.this.aa;	//해당 field에 class 변수 선언(this 사용 필수)
		int b1=green.this.bb;
		String age ="30";
		public void print() {
			green.this.userage = age;
			System.out.println(green.this.name);	//부모클래스에 있는 String name handling
			System.out.println(a1*b1);
			green.this.pt();	//부모 메소드 호출
		}
	}
}
