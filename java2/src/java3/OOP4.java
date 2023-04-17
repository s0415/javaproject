package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class OOP4 {
	/*
	 (주)이루온 - 코딩 테스트
	 해당 원시 배열 데이터를 이용하여 추상 클래스에서 해당 결과값이
	 돌출 될 수 있도록 코드를 작성하시오.
	 회원 전체의 포인트 합계를 출력하시오. (abstract 사용)
	 ※ 추상 클래스명은 Userinfo2 입니다.
	 */
	public static void main(String[] args) {
		poinck p = new poinck();
		p.point();
	}

}
class poinck extends Userinfo2{
	@Override
	public void point() {
		this.al = new ArrayList<>(Arrays.asList(data));
		int w=0;
		int sum =0;
		int ea=data.length;
		
		while(w<ea) {
			//.getClass().getName() : 자료형 확인
			System.out.println(al.get(w)[6]);
			//sum +=(int)al.get(w)[6];
			sum+=Integer.valueOf(this.al.get(w)[6]);
			w++;
		}
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("포인트 총 합계는 "+df.format(sum)+" 원입니다.");
	}
}