package java2;

import java.util.Arrays;

public class Method2 {
	//return값을 이용한 메소드

	public static void main(String[] args) {
		test2 t =new test2();
		//한개 이상의 데이터는 split으로 return 데이터 이관
		String data1 = t.userinfo1();
		String info[] = data1.split(",");	// return 받은 userinfo
		System.out.println(Arrays.toString(info));
		
		//배열형태로 해당값을 모두 받아서 처리
		String data2[] = t.userinfo2();
		System.out.println(Arrays.toString(data2));
		
	}

}

class test2{
	String user_name="홍길동";
	String user_id="hong";
	
	public String userinfo1() {	//문자열 , 기준으로 데이터를 보냄
		//return은 한개의 값만 가능하기 때문에 String user_name과 user_id를 
		//userinfo라는 새로운 String으로 만들어서 return하게된다.
		String userinfo = user_name + "," + user_id;
		return userinfo;
	}
	
	public String[] userinfo2() {
		//배열 return 메소드 
		String userinfo2[]= {user_name,user_id};//배열생성
		return userinfo2;	//배열값 return
	}
}