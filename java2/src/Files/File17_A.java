package Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File17_A {

	public static void main(String[] args) {
		try {
			String file = "D:\\memo\\asdf.jpg";	//1메가 이하
			//String file = "D:\\memo\\270X.jpg"; //1메가이상
			
			InputStream is = new FileInputStream(file); 
			if(is.available()>1048576) {
				System.out.println("1메가 이하의 이미지만 첨부하세요");
			}
			else {
				BufferedInputStream bs = new BufferedInputStream(is);
				byte[] filesize = new byte[bs.available()];
				int total = bs.read(filesize);
				
				OutputStream os =new FileOutputStream("copy.jpg");
				os.write(filesize,0,total);
				System.out.println("이미지가 등록되었습니다.");
				os.close();
				bs.close();
			}
		}
		catch(Exception e) {
			
		}

	}

}
