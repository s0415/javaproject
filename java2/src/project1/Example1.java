package project1;

import java.util.Scanner;

public class Example1 {
/*
  데브시스터즈 코딩면접(1시간)
  응용문제4.
  업,다운 퀴즈를 하도록 합니다. 
  pc가 1에서 10까지 임의의 숫자를 선택합니다. 단, interface사용
  "1에서 10까지 숫자를 입력하세요" 라는 메세지와 함께 사용자가 숫자를 하나 선택합니다.
  
  결과는 pc가 4라는 숫자가 선택하였고, 사용자가 8이라는 숫자를 선택하였다면 Down을,
  만약 사용자가 1이라는 숫자를 선택하였다면 Up이라는 선택지를 출력합니다. 단, 횟수는 딱 4회만 할 수 있도록
  합니다. pc가 뽑은 숫자와 사용자가 뽑은 숫자가 같을 경우 "정답"이라는 메세지를 출력,
  메세지 출력이 4회 이상일 경우에는 "정답을 맞추지 못했습니다"라는 결과값을 출력합니다. 
	 */

	public static void main(String[] args) {
		games ga=new games();	//외부 클래스 호출
		ga.user();	//외부 메소드 실행
		}
	}
	
class games implements game{
	Scanner sc;
	int count=0;	//카운터 값(게임 횟수)
	//this.pc : pc가 1~10 숫자를 뽑아 저장한 변수값
	@Override
	public void user() {
		sc=new Scanner(System.in);
		System.out.println("1부터 10까지 숫자를 입력하세요");
		int my =sc.nextInt();
		if(my>10) {
			System.out.println("10이하의 숫자만 입력 할 수 있습니다.");
			user();
		}
		else {
			count++;
			if(count>4) {//4회 이상 틀릴경우
				System.out.println("정답을 맞추지 못했습니다.");
			}
			else {	//4번의기회
				//return값으로 결과를 받음
				String z = result(game.pc,my);
				if(z.equals("")) {	//결과값이 없으면 정답
					System.out.println("정답");
				}
				else {	//그 외 결과는 모두 출력
					System.out.println(z);
					user();	//해당 메소드 다시 재호출
				}
			}
		}
	}
@Override
//int a : pc 숫자 int b:사용자가 입력한 숫자
	public String result(int pc, int user) {
		String msg="";
		if(pc>user) {
			msg="UP";
		}
		else if(pc<user) {
			msg="DOWN";
		}
		
	return msg;
	}
}