package java2;

public class Over3 {
	//Over1연동
	public static void main(String[] args) {
		/*
		응용문제4.
		각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오.
		예시)SKT:1 명 , KT:2 명, LGT:1명
		//메인실행		//class:Over1, method : userlist(String), 변수명:list
		*/
		corp c = new corp();
		c.userlist(null);

	}
}
class corp extends Over1{
	@Override
	public void userlist(String username) {
		super.userlist(username);
		int ea= list.length;
		int w=0;
		int count1=0,count2=0,count3=0;	//통신사 SKT,KT,LGT 3가지
		while(w<ea) {
			if(list[w][4].equals("SKT")) {
				count1++;
			}
			else if(list[w][4].equals("KT")) {
				count2++;
			}
			else {
				count3++;
			}
			w++;
		}
			System.out.printf("SKT:%d명, KT:%d명, LGT:%d명",count1,count2,count3);
			
			}
}