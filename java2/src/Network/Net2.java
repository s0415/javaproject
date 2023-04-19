package Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class Net2 {
	/*
	 PORT : 접속을 하고자 하는 경로
	 	- 80 : WEB(http://)
	 	- 443 : WEB(https://)
	    - 21 : FTP
	    - 22 : SSH
	    - 23 : Telnet
	    - 25 : SMTP(메일보내기)
	    - 110 : POP3(메일받기) - 서버와 비동기화
	    - 143 : IMAP (메일받기) - 서버와 동기화 
	 */
	
	/*
	  UDP 포트
	  SNMP : 문자발송시스템
	  VPN : 가상 IP
	 
	*/
	
	
	public static void main(String[] args) {
		try {
			getimage gi = new getimage();
			gi.img();
		}
		catch(Exception e){
			System.out.println("통신오류 발생!");
		}
		
	}

}
class getimage{
	Scanner sc = null;
	InputStream is = null;
	BufferedInputStream bi = null;
	FileOutputStream fs = null;
	
	public void img() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");
		String url = sc.nextLine();
		URL u = new URL(url);	//URL class 호출 : 네트워크 경로(절대경로 형태로 적용)
		
		//통신
		URLConnection con = u.openConnection();	//해당 경로를 연결하는 것을 말함
		//System.out.println(con);
		//
		
		int imgsize = con.getContentLength();	//이미지사이즈
		//System.out.println(imgsize);
		String imgtype = con.getContentType();	//이미지형태
		//System.out.println(imgtype);
		String date = String.valueOf(con.getDate());	//업로드날짜
		
		this.is=u.openStream();	//통신에서는 openStream만 사용가능
		this.bi = new BufferedInputStream(this.is);	//이미지파일을 임시로 메모리에저장
		//byte data[] =new byte[this.bi.available()];	//속도가 느릴수있음
		byte data[] =new byte[1024];	//1KB=1024 해당 파일을 조각냄
		
		Date today = new Date();
		String filename = today.getDate()+today.getTime()+".png";
		//System.out.println(filename);
		
		//파일 이름만 해당 경로에 생성
		this.fs = new FileOutputStream("D:\\memo\\"+filename);

		int imgdata = 0;
		int count =0;
		while((imgdata=this.bi.read(data))!=-1) {
			this.fs.write(data,0,imgdata);		//조각난 파일을 취합하여 저장시킴	
			count += imgdata;
			System.out.println("다운로드중.."+(count*100)/imgsize+"%");
		}
		
		//System.out.println(date);
		
		this.fs.flush();	//메모리초기화
		this.fs.close();
		this.sc.close();
		this.is.close();
		this.bi.close();
		System.out.println("다운로드 완료되었습니다.");
	}
}