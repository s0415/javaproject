package java1;

import java.util.Arrays;

public class Array10 {
	//2차배열 + 다차원 배열
	public static void main(String[] args) {
		//숫자형태의 2차배열
		int data[][]= {
				{1,2,3},
				{3,4,5}
		};
		//정적배열 형태 -2차배열 값 넣기
		int indata[][]=new int[2][5];	//[배열구분갯수][배열번호]
		indata[0][0]=10;
		indata[0][1]=20;
		indata[0][2]=30;
		indata[0][3]=40;
		indata[0][4]=50;
		//new int[1][5] 
		indata[1][0]=100;
		indata[1][1]=200;
		indata[1][2]=300;
		indata[1][3]=400;
		indata[1][4]=500;
		//new int[2][5]
		System.out.println(Arrays.toString(indata[0]));
		

	}

}
