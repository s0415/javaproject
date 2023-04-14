package java1;

public class Class4 {

	public static void main(String[] args) {
		/*
		응용문제4
		static이 없는 외부class 이며, 해당 class에 두개의 숫자를 인자값으로 보냅니다.
		해당 두개의 숫자 범위 안의 모든 값을 더하여 결과값을 받아 출력하는 코드를 작성하시오. 
		*/
		
		//내풀이
		A1 a1 = new A1();
		int sum = a1.aaa();
		if(sum>0) {
			System.out.println(sum);
		}
		else{
			System.out.println("a값이 b값보다 작아야합니다.");
		}
		//선생님풀이
		Box2 bx = new Box2();	//외부 클래스 객체 생성
		int sum2 =bx.result(3, 5);	//해당 클래스에 두 인자값 전달 및 return
		if(sum2==0) {	//결과값이 0일 경우
			System.out.println("두 숫자중 첫번째 숫자를 낮은 값으로 설정하십시오.");
		}
		else {	//그 외의 값일 경우
			System.out.println(sum2);
		}
	}

}
//선생님풀이
class Box2{	//같은 package안에 동일한 class사용 못함
	public int result(int a, int b) { //int: 문자사용X
		int total =0;
		if(a==0 || b==0 || a>b) {
			total =0;
		}
		else {
			while(a<=b) {	//반복문으로 해당 범위만큼 모두 합산
				total+=a;
				a++;
			}
		}
		return total;	//최종 결과값 리턴
	}
}

//내풀이
class A1{	
	public int aaa() {	
		int a = 2;
		int b = 3;
		int c=0;
		if(a<b) {
		while(a<=b) {
			c+=a;
			a++;
		}
	}
		else if(a==0 || b==0 ||a>=b){
		}
		return c;
	}
}