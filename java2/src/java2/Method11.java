package java2;

public class Method11 {
//상속 method 형태2
	public static void main(String[] args) {
		student st = new student();
		st.info("홍길동", "30");
		st.print();
		
	}

}

class person{	
	protected String name;	//java class : 같은 클래스 및 상속 클래스 모두 접근이 가능(같은 패키지 사용). 단, 별도의 외부 클래스에서는 접근이 안됨.
	protected String age;
	//setter
	public void info(String name, String age) {
		this.name=name;
		this.age=age;		
	}
	public void print() {		//print라는 메소드를 생성
		System.out.println("고객명 : "+this.name);
	}
}
class student extends person{		
	@Override	//동일한 이름과 인자값을 가진 메소드를 표시
	public void print() {		
		super.print();	//상속받는 메소드를 정리함.(값, 처리사항)
		System.out.println("나이는 : "+this.age);
	}
}

