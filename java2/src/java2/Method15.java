package java2;

public class Method15 {
	//오버라이드 규칙(설명 위해 고의로 오류 생성)
	public static void main(String[] args) {
	

	}

}
class color1{
	public String abc() {
		return null;
	}
	public boolean zzz(int nm,String nm) {	//String ->int 변경
		return true;
	}
}
class color2 extends color1{
	public void zzz() {	//color2에서 생성된 메소드
		
	}
	@Override
	public String abc() {
		return super.abc();
	}@Override	//무조건 원판 class메소드를 따라가야함
	//단, 인자명은 다르게 사용해도 문제 없음.
	public boolean zzz(int nm) {	
		//color1 zzz메소드에서 int로 적용하였지만 color2에서 기존에 있던 String 할 경우 상속 error발생
		return super.zzz(nm);
	}
}