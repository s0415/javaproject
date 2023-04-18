package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File16 {
	//이미지(Binary) 형태 byte단위로 설정(FileReader X)
	//InputStream으로 이용
	
	public static void main(String[] args) {
		try {
			//사용자가 업로드 하는 이미지
			InputStream is = new FileInputStream("D:\\memo\\asdf.jpg");
			//FileInputStream is = new FileInputStream("D:\\memo\\asdf.jpg");	//위와같음
			
			
			//사용자가 이미지 크기를 계산 후 파일을 읽어들이는 크기(단위:byte)
			
			//byte img[]=new byte[is.available()];	//메모리 크기만큼 한번에 이미지 사이즈를 읽어들임
			byte img[]=new byte[is.available()/100];	//100으로 나눠서 해당크기만큼 읽어들임
			OutputStream os = new FileOutputStream("asdf2.jpg");	//copy 경로 및 파일명
			
			int imgs =0;	//읽는 바이트 수
			int check=0;	//%로 사용자에게 생성률을 보여주기 위한 변수(학습용)
			while(true) {
				imgs = is.read(img);	//해당 파일을 읽어서 바이트 변수로 넘김
				System.out.println(imgs);
				if(imgs ==-1) {
					break;
				}
				else {
					os.write(img,0,imgs);	//이미지를 copy함
				}
				check++;
				if(check%2 ==0) {
					System.out.println(check+"%");
				}
			}
		}
		catch(Exception e){
			
		}

	}

}
