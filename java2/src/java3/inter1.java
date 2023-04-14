package java3;

public interface inter1 {
	String names="홍길동";	//전역변수
	public void z1();
	
	//일반method선언(default 사용하여 강제로 메소드 생성)
	default void z1_1(int a, int b) {	
		int c=a+b;
		System.out.println(c);
	}
}
