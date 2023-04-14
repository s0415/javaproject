package java1;

public class index2 {//클래스

	public static void main(String[] args) {//메소드
		
		String user = "홍길동";
		byte level =5;
		int point =15000;
		
		//println = Ln(line)을 뜻함 (<br>형태)
		//printf = f(일반출력)	- 한줄에 모두 출력(\n : 한줄 내림)
		
		//System.out.println(user+"님 레벨은:"+level+" 포인트:"+point);
		System.out.printf("%s\n",user);	
		System.out.printf("레벨 %d\n",level);	
		System.out.printf("포인트 %d\n",point);
		/*
		 %s : 문자 자료형
		 %d : 숫자(정수) 자료형
		 %b : boolean 자료형
		 */
		boolean ck = true;	//true,false 
		System.out.printf("동의함: %b",ck);	//
		
	}

}
