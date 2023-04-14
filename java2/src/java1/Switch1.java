package java1;

public class Switch1 {

	public static void main(String[] args) {
		//switch: 선택문
		
		int a =2;
		switch(a) {
		case 1:
		case 10:	//멀티케이스 사용
			System.out.println("옵션 1을 선택");
		break;
		
		case 2:
			System.out.println("옵션 2을 선택");
		break;
		
		case 3:
			System.out.println("옵션 3을 선택");
		break;
		
		default:
			System.out.println("옵션값이 잘못되었습니다.");
		break;
		}

	}

}
