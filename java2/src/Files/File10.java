package Files;

import java.io.IOException;
import java.io.InputStream;

public class File10 {
	/*
	 Stream 사용법
	 Stream : 이미지, 동영상, 오디오같은 파일을 로드하기 위해서 사용
	 -InputStream(최상위) : 모든 입력 장치에 대한 값을 받는 클래스 (기본:int)
	 	ㄴFileInputStream, AudioInputStream, ObjectInputStream
	 -OutputStream : 모든 출력 장치에 대한 클래스
	 
	 */
	
	public static void main(String[] args) {
		InputStream is = new InputStream() {
			//사용시 오버라이드 메소드 기본 적용됨(read와는 별도의 메소드 구성 안함)
			@Override
			public int read() throws IOException {
				int a= 15;
				return a;
			}
		};		
		try {
		//read 메소드를 호출하여 값을 return받음
		System.out.println(is.read());
		}
		catch(Exception e) {			
		}
		
		//키보드값 로드
		InputStream user = System.in;
		try {
			int keycode = user.read();	//사용자가 입력한 키를 읽어서 ASCII로 변환
			System.out.println(keycode);
		}
		catch(Exception e) {
			
		}
		
		//InputStreamReader : FileInputStream과 같은 역할
		
	}

}
