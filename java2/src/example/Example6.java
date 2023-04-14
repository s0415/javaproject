package example;

import java.util.*;	//util 안에 있는 모든 라이브러리를 사용

public class Example6 {
	//배열값을 생성하기 위한 인스턴스 셋팅
	
	Integer data[] = new Integer[10];	//10	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example6 ex = new Example6();
		ex.abc();

	}
	
	public void abc() {
		System.out.println("숫자 5개를 입력하세요.");
		//반복문으로 5개의 사용자가 입력한 숫자를 순차적으로 입력시킴
		int w =0;
		while(w<5) {
			this.data[w]=sc.nextInt();		//사용자 값을 배분
			w++;
			}
		
		System.out.println(Arrays.toString(this.data));
	}

}
