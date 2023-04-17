package java3;

import java.util.Arrays;

public class Abstract4 {
/*
 응용문제1.
 1차배열 값이 있습니다. 해당 배열값 리스트를 오름차순으로 정렬하며, 
 모든 배열값을 더하는 최종 결과값을 출력하는 코드를 작성하시오(10분)

 배열 데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
*/
	public static void main(String[] args) {
		sum_total1 s = new sum_total1();
		s.datalist();
		s.result();
	}
}
class sum_total1 extends sum_total{
	//this.sum
	Integer dali[]=null;
	@Override
	public void datalist() {
		this.dali = new Integer[]{1, 10, 15, 19, 8, 4, 7, 0, 2, 3, 9, 12};
		Arrays.sort(this.dali);	//오름차순 정렬
		//Comparator : Java8 version  , Collections.reverse() : Java7 version 이하
		//Arrays.sort(this.dali,Comparator.reverseOrder());		//내림차순 정렬(Integer, String)
		//Arrays.sort(this.dali,Collections.reverseOrder());	//내림차순 정렬(Integer, String)
		System.out.println(Arrays.toString(this.dali));
	}
	@Override
	public void result() {
		this.sum=0;	//sum값 초기화
		int ea=this.dali.length;
		int w=0;
		while(w<ea) {
			this.sum+=this.dali[w];
			w++;
		}
		System.out.println(this.sum);
		
	}
}