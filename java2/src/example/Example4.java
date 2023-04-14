package example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;		//라이브러리 호출
//라이브러리란? 소프트웨어 개발시 부가적인 옵션의 모임

public class Example4 {
	Scanner sc=new Scanner(System.in);
	Date today = new Date();	//날짜, 시간, 주일 로드하는 클래스
	//개발자가 원하는 방식으로 날짜, 시간,주일을 변경
	//y:년도, M:월, :H:시간(h시간:1~12까지),m:분, s:초;
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

	public static void main(String[] args) {
		Example4 ex=new Example4();
		ex.print();
		

	}
	public void print() {
		System.out.println(this.today);
		System.out.println(this.sd.format(today));
		System.out.println(this.time.format(this.today));
	}

}
