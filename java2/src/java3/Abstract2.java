package java3;

//Ab1.java연계
//abstract(추상) : 상속을 강제하는 일종의 규제, 즉 법칙을 제공하는 class임

public class Abstract2 {

	public static void main(String[] args) {
		box3 b = new box3();
		b.idck("hong");
		b.result();

	}

}
//추상class를 상속받을 경우 무조건 추상class안의 method를 override 해야 함

/*
 추상class의 법칙
	1. main에서 추상method를 직접 핸들링 할 수 없습니다.(바로 load 불가능)
	2. 추상 class는 상속 위주로 사용하게 됩니다.
	3. 추상 class에 별도의 코드를 작성하지 않습니다. (if,for X)
	4. field에 변수를 선언 및 값을 적용할 수 있습니다. 
	5. 추상 class안에 실제 method를 생성 시 (사용)override 하지 않아도 관계 없음
	6. 추상 class는 직접 실행이 안됩니다. 
	7. 추상 class는 추가 상속이 가능합니다. 
*/

class box3 extends Ab1{
	@Override
	public void result() {
		System.out.println(aa1);
	}
	@Override
	public void idck(String id) {
		System.out.println(id);
	}
	@Override
	public String loginck() {
	
		return null;
	}
}