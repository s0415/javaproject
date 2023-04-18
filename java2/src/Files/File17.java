package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//이미지 용량제한 체크 프로세서 만들기
/*
 이미지 업로드 할 수 있는 최대 용량은 1MB이하 입니다.
 1MB이상 파일을 업로드시 "이미지 제한 용량은 1MB이하 입니다."라는 메세지를 출력
 단, 정상적인 1MB이하면 e:memo에 이미지 복사되도록 함.
 */
public class File17 {

	public static void main(String[] args) {
		try {
			String file = "D:\\memo\\asdf.jpg";	//1메가 이하
			//String file = "D:\\memo\\270X.jpg"; //1메가이상
		
			InputStream is = new FileInputStream(file); 
			byte img[]=new byte[is.available()/100];
			
			
			int imgs =0;
			while(true) {
				imgs = is.read(img);
				//System.out.println(imgs);	//이미지용량?
				if(imgs==-1) {
					break;
				}
				else {
					if(is.available()>1048576) {
						System.out.println("이미지 제한 용량은 1MB이하 입니다.");
						break;
					}
					else if(is.available()<1048576){
						OutputStream os = new FileOutputStream("D:\\memo\\asdf3.jpg"); //1메가이하
						System.out.println("파일이 업로드 되었습니다");
						//OutputStream os = new FileOutputStream("D:\\memo\\270X2.jpg"); //1메가이상
						os.write(img,0,imgs);
						is.close();
						os.close();
					}
				}
				
			}
			
		}
		catch(Exception e) {
			
		}
	}

}
