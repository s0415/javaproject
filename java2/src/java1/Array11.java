package java1;

import java.util.Arrays;

public class Array11 {
	//2차 배열 응용편
	public static void main(String[] args) {
		/*
		응용문제7.
		Adata와 Bdata 두 가지 배열값을 더한 후 
		해당 배열값을 기준으로 짝수, 홀수인지를 나열하는 배열 결과를 출력하도록 코드를 작성하시오.
		Adata = 5 17 19 22 33
		Bdata = 1 2 3 4 5
		Result =["짝수","홀수","짝수","짝수","짝수"]
		*/

		int data[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		String Result[]=new String[data[0].length];
		int w=0;
		while(w<data[0].length) {
			int sum=data[0][w]+data[1][w];
			if(sum%2==0) {
				Result[w]=("짝수");
			}
			else {
				Result[w]=("홀수");
			}
			w++;
		}
		System.out.println(Arrays.toString(Result));
	}
}