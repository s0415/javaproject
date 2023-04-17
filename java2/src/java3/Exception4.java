package java3;

import java.util.ArrayList;

//예외처리 응용편2
/*
 "hong3000"
 "park1250"
 "kang852"
 "kim1819"
 "lee5117"
 
 전체 포인트 합계를 출력하는 프로세서를 구축하시오.
 */
public class Exception4 {
	public static void main(String[] args) {
		String data[]= { "hong3000","park1250","kang852","kim1819","lee5117"};
		ArrayList<String> al = new ArrayList<>();
		int w=0;
		while(w<data.length) {
			al.add(data[w].replaceAll("[a-zA-Z]",""));
			w++;
			}
		//System.out.println(al); 포인트 분리된것 확인
		try {
			ex e = new ex();
			e.datain(al);
			
		}
		catch (Exception e){
			if(e.getMessage()!=null) {	//문제 발생한 경우
				System.out.println(e);
			}
		}
	}
}

class ex{
	public void datain(ArrayList<String> point) throws Exception{	
		//ArrayList에 <String>안 쓴 경우 sum+=Integer.valueOf((String)point.get(w)); 으로 써줘야함
		int w=0;
		int sum=0;
		while(w<point.size()){
			/*
			ArrayList에서 숫자로 변환시 
			(String)자료형을 적용 후 Integer.valueOf(String)
			또는 Integer.ParseInt를 이용하여 자료형 없이 적용 가능
			*/
			//sum+=Integer.valueOf((String)point.get(w));
			sum+=Integer.valueOf(point.get(w));
			w++;
		}
		System.out.println("총 포인트 :"+sum+" 점");
		Exception e=new Exception();
		throw e;
	}
}