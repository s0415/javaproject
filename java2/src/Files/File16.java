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
			InputStream is = new FileInputStream("D:\\memo\\asdf.jpg");
			//FileInputStream is = new FileInputStream("D:\\memo\\asdf.jpg");
			//byte img[]=new byte[is.available()];
			byte img[]=new byte[is.available()/100];
			OutputStream os = new FileOutputStream("asdf2.jpg");
			
			int imgs =0;
			int check=0;
			while(true) {
				imgs = is.read();
				if(imgs ==-1) {
					break;
				}
				else {
					os.write(img,0,imgs);
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
