package example;

//class : 틀,  	객체 : 제품,  인스턴스 : 제품의 박스


public class Example2 {
	public final int data1 = 20;	//final : 상수선언
	String abc ="홍길동";
	

	public static void main(String[] args) {	
		final int data2 = 50;	//메소드 안에 상수선언
		//field 에 있는 값을 main에서 직접 핸들링 X
		Example2 ex = new Example2();	//객체 생성 및 인스턴스로 등록
		System.out.println(ex.data1);
		ex.abc="이순신";
		ex.aaa();

	}
	
	public void aaa() {			//확장 메소드에서는 field에 있는 값 핸들링이 가능함
		this.abc="강감찬";
		System.out.println(this.abc);
		System.out.println(data1);
	}

}
