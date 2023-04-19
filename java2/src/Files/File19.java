package Files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File19 {

	public static void main(String[] args) {
		try {
			String url = "D:\\git_java\\javaproject\\java2\\src\\Files\\user.txt";
			InputStream fs = new FileInputStream(url);
			
			//**이미지, 동영상 형태
			//BufferedInputStream bs = new BufferedInputStream(fs);
			//byte[] b = new byte[fs.available()];
			
			//**문서파일 형태
			InputStreamReader ir = new InputStreamReader(fs);
			BufferedReader br = new BufferedReader(ir);
			//System.out.println(br.readLine());
			String result ="";
			while((result=br.readLine())!=null) {
				System.out.println(result);
				br.close();
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
