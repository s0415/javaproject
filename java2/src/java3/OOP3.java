package java3;

import java.util.Arrays;
import java.util.LinkedList;

public class OOP3 {
	/*
	  (주)씨이랩
	  응용문제2.
	  본데이터 15,22,37,8,11,19,41 이 있습니다.
	  해당 본 데이터를 다음 결과같이 커스텀 하여 출력하시오.
	  커스텀 결과 [7,15,22,8,11,39,41]
	  테스트 시간(10분)
	 */
	public static void main(String[] args) {
		Integer data[] = {15,22,37,8,11,19,41};
		LinkedList<Integer> aa = new LinkedList<>(Arrays.asList(data));
		aa.add(0,7);
		aa.remove(3);
		aa.remove(5);
		aa.add(5,39);
		System.out.println(aa);
		

	}

}
