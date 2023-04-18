package Files;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7_A {
	//File7 풀이 전 : 배열화&배열 합치기
	
	public static void main(String[] args) {
		database mdb = new database();
		try {
		mdb.db();
		}
		catch(Exception e) {
			System.out.println("메소드 오류");
		}
	}
}
class database{
	FileReader fr = null;
	Scanner sc = null;
	ArrayList<String[]> ln =null;	//빈 2차배열
	String data[]=null;	//1차배열(member.txt의 한 줄은 1차배열)
	
	// 경로 : 웹(/) - Servlet, Spring			Java(\) 경로
	public void db() throws Exception{
		this.fr = new FileReader("D:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		this.ln = new ArrayList<>();
		while(this.sc.hasNext()) {
			
			//split으로 구분하여 1차배열로 이관
			this.data = this.sc.nextLine().split(",");
			//System.out.println(Arrays.toString(this.data));	//원시1차배열 출력
			this.ln.add(this.data);	//1차배열값을 ArrayList(2차배열)에 이관함
		}
		//System.out.println(Arrays.toString(this.ln.get(1)));	//2차배열의 배열1 출력
		
		//2차배열이상 출력시 deepToString 및 toArray 메소드를 사용하면 전체 출력할 수 있음.
		System.out.println(Arrays.deepToString(this.ln.toArray()));
	
	}
		/*
		
		//개념 설명 
		 
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		//2차 배열값을 적용할때 사용 LinkedList,List,Map
		//LinkedList<LinkedList<String>> all = new LinkedList<>();
		ArrayList<ArrayList<String>> all = new ArrayList<>();
		
		String data ="1,2,3,4,5,10,20,30,40,50";
		String data2[]=data.split(",");
		
		int ea = data2.length;
		int w=0;
		
		while(w<ea) {
			if(w<5) {
				a1.add(data2[w]);
			}
			else {
				a2.add(data2[w]);
			}
			w++;
		}
		//두 배열을 합침???
		all.add(a1);
		all.add(a2);
		all.add(a1);
		System.out.println(all);
		}
		*/
	}