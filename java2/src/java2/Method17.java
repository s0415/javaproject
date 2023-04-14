package java2;

public class Method17 {
	//Method 18 연계작업
	public static void main(String[] args) {
		pt ds = new pt();
		ds.display();
	}
}
class pt{	//Method18번 사용이 가능할까? - 오버라이드 사용 가능
	public void display() {
		System.out.println("메인 데이터 호출");
		
	}
	
}