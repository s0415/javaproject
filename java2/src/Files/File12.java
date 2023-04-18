package Files;

import java.io.FileInputStream;
import java.io.InputStream;

public class File12 {
	//Stream을 이용한 파일 로드
	public static void main(String[] args) {
		try {
			filein fi = new filein();
			fi.fileload();
		}
		catch(Exception e){
			
		}
	}

}

class filein{
	InputStream is = null;
	
	public void fileload() throws Exception{
		this.is = new FileInputStream("D:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		//available() : 파일의 용량 크기(byte단위)를 확인할 수 있습니다. 
		//System.out.println(is.available());
		
		//byte 배열 값을 해당 파일을 로드한 크기와 동일하게 생성하라는 뜻
		byte temp[]=new byte[is.available()];
		//byte temp[] = new byte[1024*16];	//16KB 초과시 로드하지않음	//파일에 용량제한
		
		/*
		 두줄로 출력
		int ea = this.is.read(temp);	//this.is.read(temp);가능 - int 생략가능
		String data = new String(temp);
		 */
		
		//OutStream 형태로 바로출력 - 한줄쓰기
		String data = new String(temp,0,this.is.read(temp));
		
		
		System.out.println(data);
		
	}
}