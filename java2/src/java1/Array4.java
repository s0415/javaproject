package java1;

public class Array4 {
	//배열 범위 설정 및 값 추가하기
	public static void main(String[] args) {
		
		int a[]=new int[5];	//a[]변수에 배열값 범위를 생성
		//숫자로 0부터 해당 값을 삽입
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		
		int ea=a.length;
		//System.out.println(ea);
		int w=0;
		while(w<ea) {
			System.out.println(a[w]);
			w++;
		}
		
		//문자배열로 추가
		String user[]=new String[3];
		user[0]="홍길동";
		user[1]="강감찬";
		user[2]="유관순";
		int le=user.length;
		//System.out.println(le);
		int ww=0;
		while(ww<le) {
			System.out.println(user[ww]);
			ww++;
		}
			
		//단축코드로 배열값 추가
		int number[]=new int[] {1,2,3,4,5};
		int ea2 = number.length;
		//System.out.println(ea2);
		int w2=0;
		while(w2<ea2) {
			System.out.println(number[w2]);
			w2++;
		}

	}

}
