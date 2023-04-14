package java1;

import java.util.Arrays;

public class Random2 {
	//random으로 활용법
	public static void main(String[] args) {
		/*
		응용문제1.
		pc가 1부터 46까지의 숫자 6개를 무작위로 생성합니다.
		생성된 6개의 숫자를 배열화 하여 출력하시오. 
		*/
		/*String lists="";
		int f;
		for(f=1;f<=6;f++) {
			int number = (int)Math.ceil(Math.random()*46);
			
			lists+=number+" ";
		}
		String nums[]=lists.split(" ");
		System.out.println(Arrays.toString(nums));*/
		
		int number[]=new int[6];
		int f;
		for(f=1;f<=6;f++) {
			int pc=(int)Math.ceil(Math.random()*46);
			number[f-1]=pc;
		}
		System.out.println(Arrays.toString(number));
		
		
	}

}
