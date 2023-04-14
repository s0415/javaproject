package java1;

public class Array12 {

	public static void main(String[] args) {
		/*
		응용문제8.
		데이터 배열에 있는 모든 짝수값의 합산 결과를 출력하시오.
		단, 해당 배열은 2차배열 형태입니다. 
		1번 데이터 : 11 42 22 16
		2번 데이터 : 7 33 10 29
		최종결과값 : 90
		*/
		
		int data[][]= {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ea = data.length;	//배열그룹(2)
		int ea2 = data[0].length;	//배열 갯수(5)
		int w=0;
		int total=0;
		do {
			int ww=0;
			do{
				if(data[w][ww]%2==0) {
					total += data[w][ww];
			}
				ww++;
			}while(ww<ea2);
			w++;
		}while(w<ea);
		System.out.println("최종합계 :"+total);
		
		/*
		int w=0;
		int sum=0;
		int sum2=0;
		while(w<data[0].length){
			if(data[0][w]%2==0) {
				sum=data[0][w]+sum;
				if(data[1][w]%2==0) {
					sum2=data[1][w]+sum2;
				}
			}
			w++;
		}
		System.out.println(sum+sum2);
		*/
	}

}
