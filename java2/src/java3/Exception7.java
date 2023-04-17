package java3;

import java.util.LinkedList;

public class Exception7 {
//예외처리로 발생하는 코드 테스트
	
	/*
	응용문제1.
	데이터파일 {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
	해당 데이터 값 중 문자값만 출력되도록 재배열 하시길 바랍니다.
	
	단, 메인에서는 해당 배열을 외부 클래스 setter로 전송합니다.
	해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
	getter에서 해당 배열을 return으로 보내도록 합니다.
	단, 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
	*/
	
	public static void main(String[] args) {
		Object data1[]= {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
		try{	//예외처리
			rdata r = new rdata();	//(1).class호출
			r.setter(data1);	//(2).setter 메소드 값 전달
			//(4).getter메소드 호출 및 배열 자료형으로 받음
			LinkedList<String> result = r.getter();	
			System.out.println(result);	//(6).최종출력
		}
		catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("에러발생");
			}
		}
	}

}


class rdata{
	LinkedList<String> ls = new LinkedList<>();	//빈 배열 생성
	//setter : 데이터를 생성 및 가공
	//getter : 데이터를 출력(return)
	
	//(3).Object 배열을 setter가 받음
	public void setter(Object[] call) throws Exception{	//setter
		int ea = call.length;
		int w=0;
		do {
			try {	//문자만 배열에 입력,숫자 자료형일 경우 예외처리
				String check = String.valueOf((String)call[w]);
				//System.out.println(check);	//문자열만 출력
				this.ls.add(check);
			}
			catch(Exception ex) {} //예외처리발생
			w++;
		}while(w<ea);
		//System.out.println(this.ls);
	}
	public LinkedList<String> getter() {	//(5).배열 자료형으로 return시킴
		return this.ls;
	}
}
	
