package java1;

import java.util.Arrays;

public class Array8 {
	//배열 합치기 응용
	public static void main(String[] args) {
		/*
		응용문제7.
		데이터 배열 2가지가 있습니다. 해당데이터 배열을 다음 결과처럼 값을 출력하세요.
		1번 data : 대한민국 일본 중국 베트남 태국
		2번 data : 40 35 70 55 32
		결과출력 data
		["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		*/
		String data1[]= {"대한민국","일본","중국","베트남","태국"};
		int data2[]= {40,35,70,55,32};
		String data3[] = new String[data1.length];
		
		int w=0;
		while(w<data1.length) {
			data3[w]=data1[w]+"("+data2[w]+")";
			//data2 int에서 String으로 변환
			//data3[w]=data1[w]+"("+String.valueOf(data2[w])+")";
			//data3[w]=data1[w]+"("+Integer.toString(data2[w])+")";
			w++;
		}
		System.out.println(Arrays.toString(data3));
	}

}
