package java1;

import java.text.SimpleDateFormat;
import java.util.*;	//모든 java.util에 있는 클래스를 로드함

public class index13 {
	//JAVA : OOP(객체지향언어) , Javascript:OOP스크립팅 언어

	public static void main(String[] args) {
		// 날짜 출력 형태(sql:dbase용)
		Date today = new Date();
		System.out.println(today);

		//y:년도, m:월, d:일
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
		//H:시간, m:분, s:초, 소문자 h:am, pm별도로 구성해야함
		SimpleDateFormat time = new SimpleDateFormat("H:mm:s");
		
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH시mm분ss초");
		
		//a : 오전, 오후 표시
		SimpleDateFormat date2 = new SimpleDateFormat("hh:mm:ss a");
		
		//format() : 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));
		
		
	}

}
