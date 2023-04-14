package java3;

public class Interface3 {
	//user1.java,user2.java 응용편
	/*
	응용문제2.
	가입된 모든 사용자의 정보를 출력합니다. 
	출력형태는 다음과 같습니다.
	아이디 : hong, 고객명 : 홍길동, 이메일 : hong@nate.com, 지역 : 서울시 영등포구
	*/

	
//선생님풀이
	public static void main(String[] args) {
		reno r = new reno();
		r.myinfo("");
	}
}
class reno implements user1{	
//user2 interface는 로드하지 않음. 단, user2에 있는 field 변수명은 별도로 호출 할 수 있음. 
	@Override
	public void myinfo(String userid) {
		int ea = dataea();
		int w =0;
		while(w<ea) {
			System.out.println("아이디 : "+userdata[w][0]+" 고객명 : "+user1.userdata[w][1]+" 이메일 :"+this.userdata[w][2]+" 지역: "+user2.infodata[w][2]);
			
			w++;
		}
		
	}
	@Override
	public void mytel(String usertel) {
		
	}
}

	
	
/*
//내풀이	

	
	public static void main(String[] args) {
		user_info f = new user_info();
		f.myinfo(null);
	}
}



class user_info implements user1,user2{
	private int total;
	@Override
	public void myinfo(String userid) {
		int w=0;
		this.total=dataea();
		//System.err.println(this.total);
		while(w<this.total) {
			System.out.println("아이디 : "+(userdata[w][0]+" 고객명 : "+userdata[w][1]+" 이메일 :"+userdata[w][2]+" 지역: "+infodata[w][2]));
			w++;
		}
	}
	@Override	//사용X
	public void mytel(String usertel) {
		
	}
	@Override	//사용X
	public String pointck(String userid) {
		return null;
	}
	public user_info() {
	}
}
*/