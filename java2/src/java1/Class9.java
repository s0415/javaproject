package java1;

import java.util.Scanner;

public class Class9 {
	//응용편 : 예약시스템 3. 쿠폰적용된 최종가격 출력 / 미적용시 원가출력
	public static void main(String[] args) {
		Room re = new Room();
	}
}
	
class Room{
	public Room() {
		select();
	}
	public void select() {
		String se1 = inputs("방번호를 입력하세요");
		if(se1.equals("1")) {
			String se2 = inputs("1.무지개룸 : 60,000원 입니다. 30% 할인 쿠폰을 적용하시겠습니까? (y/n)");
			if(se2.equals("y")) {
			System.out.println("예약금은 42,000원 입니다.");	
			}
			else if(se2.equals("n")) {
				System.out.println("예약금은 60,000원 입니다.");
			}
			else {
				System.out.println("y/n만 입력할 수 있습니다.");
			}
		}
		else if(se1.equals("2")) {
			String se2 = inputs("2.패밀리룸 : 125,000원 입니다. 30% 할인 쿠폰을 적용하시겠습니까? (y/n)");
			if(se2.equals("y")) {
				System.out.printf("예약금은 87,500원 입니다.");	
				}
				else if(se2.equals("n")) {
					System.out.println("예약금은 125,000원 입니다.");
				}
				else {
					System.out.println("y/n만 입력할 수 있습니다.");
				}
			
		}
		else if(se1.equals("3")) {
			String se2 = inputs("3.달빛아래룸 : 100000원 입니다. 30% 할인 쿠폰을 적용하시겠습니까? (y/n)");
			if(se2.equals("y")) {
				System.out.printf("예약금은 70,000원 입니다.");	
				}
				else if(se2.equals("n")) {
					System.out.println("예약금은 100,000원 입니다.");
				}
				else {
					System.out.println("y/n만 입력할 수 있습니다.");
				}
		}
		else {
			System.out.println("올바른 값이 아닙니다.");
		}
	}
	public String inputs(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		sc.close();
		return result;
		
	}
}