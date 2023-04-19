package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//Stream을 사용하고 나서 Buffered 사용: read, write 단독으로 사용은 하지 않음

//read : int형태, readLine : String 형태

/*
 InputStream > InputStreamreader > BufferedReader (O)
 InputStream > BufferedInputStream (O)
 InputStream > BufferedReader (X)
 InputStreamreader > BufferedReader (O)
 
 * BufferedReader - close(); 메모리종료 필요
 * BufferedWriter - flush(); 메모리 초기화 + close() 메모리 종료
 
*/
public class File18 {

	public static void main(String[] args) {
		try {
		/*
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("홍길동");
		bw.close();
		*/
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String test = br.readLine();
		System.out.println(test);
		
		/*
		 반복문 대신 사용
		 FileInputStream -> BufferedInputStream
		 FileOutputStream -> BufferedOutputStream

		 Buffered는 Stream의 이름에 맞게 받아야함
		 */
		
		}
		catch(Exception e) {
			
		}
		
	}

}
