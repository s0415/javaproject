package java1;

//class만 단독으로 사용 가능
public class Class1 {	//class없이 method는 없습니다. public class는 한번만 사용 가능
	//필드공간(전역변수, 전역개체)
	//static : 메모리를 직접적으로 핸들링하는 속성
	
	static int money = 1000; //class 변수
	
	public static void main(String[] args) {	//main : 실행 method
		
		String name = "유관순";	//지역변수

		Adata ad = new Adata();		//해당 클래스를 객체로 변환
		Bdata bd = new Bdata();
		System.out.println(ad.a);	//해당 객체에 있는 변수값을 로드
		System.out.println(bd.a);
		
		Cdata cd = new Cdata();
		cd.aa=10;	//Cdata 클래스 안의 변수를 호출 후 값을 이관
		cd.bb=30;
		cd.cc=cd.aa+cd.bb;
		System.out.println(cd.cc);
		
		
		
	}
}

class Adata{	//보조class
	String a = "홍길동";
}
class Bdata{
	String a = "이순신";
}
class Cdata{
	//인스턴스 변수 생성
	int aa;	//숫자할당
	int bb;	//숫자할당
	int cc;	//결과값
}