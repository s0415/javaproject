package project1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 (주)CJ운송에서 테스트 코딩
 사용자가 8명 있습니다.
 각각의 사용자에게 포인트를 배부해야 합니다. 다음 결과와 같이 나오도록 코드를 작성하시오.
 customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
 "서울 님에게 포인트를 추가 하시겠습니까?"
 ...
 "전남 님에게 포인트를 추가 하시겠습니까?"
 무조건 숫자를 입력하며 숫자 외에 입력시 "포인트는 숫자만 입력합니다." 출력
 
 단, 인천 님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
 "인천 님에게 포인트를 추가 하시겠습니까?"라고 질문이 나와야 합니다.
 
 최종 결과 정보
 서울 :500
 경기도 : 300
 인천 : 300
 ...
 
 */
public class Example3 {

	public static void main(String[] args) {


	}
}
class point{
	ArrayList<Object[]> al;
	Object data[][];
	
	public void data() {
		this.data=new Object[][] {
			{"서울",0},
			{"경기도",0},
			{"인천",0},
			{"대전",0},
			{"충북",0},
			{"충남",0},
			{"전북",0},
			{"전남",0}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
	}
}