package java3;
///http://mekeyace.dothome.co.kr/userdb.txt
//user1.java, user2.java 응용편

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interface2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요 :");
		String id = sc.next();
		sc.close();
		userinfo ui =new userinfo();
		ui.myinfo(id);
	}
}
//사용자 포인트 확인하는 페이지 구성
class userinfo implements user1,user2{	//두 인터페이스에 같은 메소드가 있으면 하나만 호출해도 됨(ex.myinfo(String userid);)
	private int total;
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	
	@Override	//사용X
	public void mytel(String usertel) {
		
	}
	
	@Override
	public void myinfo(String userid) {
		int count=0;
		this.total = dataea();
		//System.out.println(this.total);
		int point=0;	//method안에 존재하기 때문에 this.point로 사용X(this는 field에 위치한 변수에만 사용 가능)
		
		//데이터 로드 부하를 줄이기 위해서 사용하는 형태
		try {
			System.out.println("잠시만 기다려 주시기 바랍니다.(조회중..)");
			Thread.sleep(5000);
		}catch(Exception e) {}
		
		int w=0;
		while(w<this.total) {
			//사용자가 검토하는 아이디와 배열값(user2)에 있는 아이디가 같을 경우
			if(userid.equals(user2.infodata[w][0])) {
				count++;
				//문자를 숫자로 변환
				point = Integer.valueOf(user2.infodata[w][4]);
			}
			w++;
		}
		if(count==0) {	//검색결과가 없을 경우 출력
			System.out.println("등록된 회원이 아닙니다.");
		}
		else {	//해당아이디가 있을경우
			//DecimalFormat : 숫자 자료형에 자동으로 , 기능을 적용하여 출력함
			DecimalFormat df = new DecimalFormat("###,###");	
			System.out.println(userid+" 고객님의 포인트는 "+df.format(point)+"점 입니다.");
		}
		
	}
	
	@Override
	public String pointck(String userid) {
		return null;
	}
	
	
}