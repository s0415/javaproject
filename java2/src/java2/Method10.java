package java2;

//setter, getter
public class Method10 {
	private String name = null;
	private String subject = null;
	private String sign = "false";
	
	public String gtdata() {	//getter
		return sign;	//최종 결과값을 Method9으로 전달하는 기능
	}

	public void score(String name, String subject) {	//setter
		//Method9에서 사용자가 입력한 값을 받아오는 역할
		this.name = name;
		this.subject = subject;
		
		String user[][] = {
				{"홍길동","이순신","유관순","강감찬","장보고"},
				{"80","77","92","67","100"},	//국어
				{"40","100","80","92","67"},	//수학
				{"95","88","42","98","50"},		//과학
				{"40","92","100","95","30"}		//역사
		};
		int ea = user[0].length;
		int w = 0;
		while(w < ea) {
			
			if(user[0][w].equals(this.name)) {
				
				int ww = 1;
				this.sign = "";
				while(ww < ea) {
					//과목명 체크
					switch(this.subject) {
					case "국어":
						this.sign = user[1][w];
					break;
					
					case "수학":
						this.sign = user[2][w];
					break;
					
					case "과학":
						this.sign = user[3][w];
					break;
					
					case "역사":
						this.sign = user[4][w];
					break;
					
					case "전체":
						
						this.sign += user[ww][w]+",";
					break;
					
					default:
						this.sign = "해당 데이터는 찾을 수 없습니다.";
					break;
					}
					
					//System.out.println(user[ww][w]);
					ww++;
				}				
			}
			
			w++;
		}
	}
}
