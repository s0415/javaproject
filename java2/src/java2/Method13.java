package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 a= new gugudan2();
		a.gugu();
	}
}
/*
응용문제1.
사용자가 숫자 하나를 입력합니다. 2nd 개발자가 입력된 사항을 1부터 9까지 결과가 출력되는 구구단을 개발합니다.
단, 상속받은 메소드에서 처리되도록 코드를 작성하시오.
ex)"검색할 구구단을 입력하세요" >5입력
5*1=5
...
5*9=45
*/

class gugudan{
	protected int number;
	public void gugu() {
		Scanner sc =new Scanner(System.in);
		System.out.println("검색할 구구단을 입력하세요");
		number = sc.nextInt();
		sc.close();
	}	
	public void result(int number) {

	}
}
class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		result(this.number);
	}
	@Override
	public void result(int number) {	
		super.result(number);
		int w=1;
		while(w<10) {
			System.out.printf("\n%d*"+w+"="+number*w,number);
			w++;
		}
	}
}

/*
//선생님풀이
class gugudan{
	protected int number;
	Scanner sc =new Scanner(System.in);
	public void gugu() {
		System.out.println("검색할 구구단을 입력하세요");
	}	
	public void result() {

	}
}

class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		this.number=sc.nextInt();	//setter
		result();
	}
	@Override
	public void result() {	
		super.result();
		int w=1;
		while(w<10) {
			System.out.printf("\n%d*"+w+"="+number*w,number);
			w++;
		}
	}
}
*/