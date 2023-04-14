package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1 {

	//List, ArrayList, LinkedList, Map(key)
	public static void main(String[] args) {
		/*
		 응용문제1.
		 사용자가 입금을 처리하게 됩니다.
		 총 8번의 횟수 금액을 입력하게 되며,
		 모든 입금이 완료 되었을 경우 최종 합계 금액을 출력시키는
		 프로세서를 구축하시오.
		 예시) 
		 입금할 금액을 적으세요?
		 500
		 입금할 금액을 적으세요?
		 1000
		 ....
		 50 1000 500 1500 200 100 50 50
		 최종 입금금액 : 3,900원
		 */
		
		bank ba = new bank();
		ba.indata();
		
		/*
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		int w = 1;
		int sum = 0;
		Integer money;
		while(w < 9) {
		System.out.println("입금할 금액을 입력하세요");
		money = sc.nextInt();
		al.add(money);
		sum += money;
		w++;
		}
		System.out.println(al);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("최종 입금금액:"+df.format(sum));
		sc.close();
		*/
		
	}
}
//쌤풀이 외부클래스사용

class bank {
	//메모리에 등록
	Scanner sc;
	LinkedList<Integer> li;
	Integer sum = 0;
	
	public void indata() {
		this.li = new LinkedList<>();
		
		while(true) {
		try {	//숫자 입력시
		this.sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요");
		int money = this.sc.nextInt();
		this.li.add(money);
		this.sum += new Integer(money);	//heap로 설정함
		int count = this.li.size();	//사용자가 입력한 누적 배열 데이터 갯수
		if(count == 8) {	//배열 데이터 갯수 제한 체크
			break;	//무한 loop 종료
		}
		}
		catch (Exception e) {	//숫자 미입력시
			System.out.println("숫자만 입력하세요");
			continue;	//다시 반복문으로 복귀
		}
		}
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(this.li);
		System.out.println("최종 입금금액"+df.format(this.sum)+"원");
		this.sc.close();
	}
}
