package java3;

public class Interface1 {
	//interface 사용법 ( inter1.java, inter2.java 사용)
	//interface의 특징 : class가 없음(추상메소드)
	public static void main(String[] args) {
		key k =new key();
		k.z1();
		k.z2();
	}
}
	/*
	 Interface 상속을 받기 위해서는 implements를 이용함(extends 사용 X)
	 Interface는 부품이며, 해당 부품을 조립하여 프로그램을 완성하는 형태
	 또한, 여러개의 Interface를 한번에 모두 로드할 수 있음
	 
	 Interface 단점 : 일반method 생성 불가
	 	단, 강제로 메소드를 생성할 수 있음.(default 이용시)
	 	
	 동일한 변수를 사용시 this를 사용하지 못하며, 해당 interface 메소드 이름을 입력 후 해당 변수명을 적용해야 합니다.
	 ex)인터페이스이름.변수명 (inter1.names) (inter2.name)
	 
	 interface와 abstract는 같이 쓰지않음(작동은가능)
	*/
class key implements inter1, inter2{
	@Override	//강제생성한 일반메소드(사용 유/무 관계없음)
		public void z1_1(int a, int b) {
			inter1.super.z1_1(a, b);
		}
	@Override
	public void z1() {
		System.out.println(inter1.names);
		//= System.out.println(this.names);
	}
	@Override
	public void z2() {
		//this.names 사용 불가(inter1에도 String name이 있고 inter2에도 String name이 존재)
		System.out.println(inter2.names);	
	}
	@Override
	public String z3() {
		return null;
	}
}