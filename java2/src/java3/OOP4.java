package java3;

import java.util.Arrays;
import java.util.LinkedList;

public class OOP4 {
	/*
	 (주)이루온 - 코딩 테스트
	 해당 원시 배열 데이터를 이용하여 추상 클래스에서 해당 결과값이
	 돌출 될 수 있도록 코드를 작성하시오.
	 회원 전체의 포인트 합계를 출력하시오. (abstract 사용)
	 ※ 추상 클래스명은 Userinfo 입니다.
	 */
	public static void main(String[] args) {
		 po p = new po();
		 p.datalist();
	}

}
abstract class Userinfo2{
	public abstract void datalist();
}

class po extends Userinfo2{

 @Override
public void datalist() {
	String data[][] = {
				{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
				{"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
				{"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
				{"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
				{"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
				{"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
				{"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
				{"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
				{"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
				{"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
				{"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
		};
	 LinkedList<String[]> aa = new LinkedList<String[]>(Arrays.asList(data));
	 //System.out.println(Arrays.toString(aa.get(0)));
	 int w = 0;
	 int a = data.length;
	 //System.out.println(a);
	 int sum = 0;
	 while(w < a) {
		 sum += Integer.valueOf(aa.get(w)[6]);
		 w++;
	 }
	 System.out.println(sum);
}
}