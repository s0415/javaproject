package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {
	//List 배열 사용법
	//List (Array 업그레이드) 순서가 있는 데이터 집합 배열과는 다르게 빈 배열값을 허용하지 않습니다.
	//메모리 공간의 크기를 동적으로 변경가능 합니다.
	//메모리 재사용이 편리하다.
	
	public static void main(String[] args) {
		
		String data[] = {"hong","kim","park"};
		List<String> aa = new ArrayList<>(Arrays.asList(data));
		aa.remove("park");
		System.out.println(aa);
		//1 = 1M(메가)
		List<Integer> bb = new ArrayList<>(1); //메모리 초기 용량크기(저장가능한 메모리크기) 비워두면 메모리 무한대로 사용(배열갯수 크기X)
		int w = 0;
		while(w < 100) {
			bb.add(w);
			w++;
		}
		System.out.println(bb);
	}

}
