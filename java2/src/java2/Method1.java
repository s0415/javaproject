package java2;

public class Method1 {
	//메소드를 이용한 동적변수,정적변수 활용
	public static void main(String[] args) {
		tests t=new tests();	//객체 클래스 생성하여 인스턴스로 적용
		t.a++;
		t.b++;
		t.t1();
		
		tests tt = new tests();	//객체 클래스 생성하여 인스턴스로 적용
		tt.a++;
		tt.b++;
		tt.t1();
		
		t.user1 += "유관순";
		t.user2 += "유관순";
		t.t2();
		
		tt.user1 += "강감찬";
		tt.user2 += "강감찬";
		tt.t2();
		
	}

}

class tests{
	int a=1;	//(동적변수)새로운 객체 생성 및 class를 호출시 무조건 1부터 다시 시작
	public static int b =1;	//(정적변수)메모리에 등록되어서 변화된 값을 유지
	
	String user1 ="이순신";
	public static String user2="홍길동";
	
	public void t1() {
		System.out.println(a);
		System.out.println(b);
	}
	public void t2() {
		System.out.println(user1);
		System.out.println(user2);
	}
}