package java3;
//추상 class

//abstract4 
abstract class sum_total{
	public int sum;
	public abstract void datalist();
	public abstract void result();
	
}



//main class가 없어야 합니다.
public abstract class Ab1 {
	
	public int aa1=30;	//변수에 abstract 적용 불가능
	public abstract String loginck();
	public abstract void idck(String id);
	public abstract void result();
	public void ab_1() {	//추상class의 실제 메소드
		
	};

}
//외부 가상 class를 만들기 위해서는 public을 사용하지 않습니다.
abstract class aa {
	public abstract int password();	//가상메소드 생성	//private 사용 X, public&default 가능
}
abstract class aa2 extends aa{	//추상 class끼리 상속을 받음
	//추상class끼리 상속받는경우 override하지 않습니다.
	public abstract String user_info();
}

//일반class method
class aa3{
	public String aa3_method() {
		return null;
	}
}