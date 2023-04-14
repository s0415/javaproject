package project1;
//pc가 자동으로 뽑는 숫자 1~10까지

public interface game {
	//PC가 1~10까지 숫자를 하나 선택함(해당 파일 stack 올림)
	int pc = (int)Math.ceil(Math.random()*10);
	
	public void user();			//사용자가 입력하는 부분
	
	public String result(int pc, int user);
	
}
