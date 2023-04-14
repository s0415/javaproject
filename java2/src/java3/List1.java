package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {
	//List 라이브러리
	public static void main(String[] args) {
		String member[]= {"박소은","윤준승","김여름"};
		/*
		ArrayList<자료형> : java의 라이브러리 배열 method입니다. 
		Arrays.asList : 로드 할 배열값을 말합니다.
		add(추가), get(배열 데이터 로드), remove(배열값 삭제),size(배열 데이터 갯수)
		중요사항 : add사용시 무조건 맨 뒤에 데이터가 추가됩니다.
				단, index 번호를 적용 후 값을 실행시 해당 index부분에 추가가 될 수 있습니다. 
		*/
		ArrayList<String> al = new ArrayList<>(Arrays.asList(member));
		System.out.println(al.size());
		/*
		al.add("박소은");
		al.add("윤준승");
		al.add("김여름");
		*/
		al.add(1,"심규환");	//배열 1번자리에 삽입(index1번)
		al.add("이하늘");
		//System.out.println(al);
		String user =al.get(4);
		System.out.println(user);
		al.remove(4);
		System.out.println(al);
		
	}

}
