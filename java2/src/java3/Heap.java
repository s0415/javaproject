package java3;

public class Heap {

	//메로리 : Stack : cpu 캐시 메모리, Heap : 실제 메모리(메모리 제한없음)
	static int box2 = 20; //Stack
	
	public static void main(String[] args) {
		int box1 = 20;	//Stack		20
		Integer box3 = 20;	//Stack		0x0002
		Integer box4 = new Integer(20);	//Heap 영역	20 (0x0002)둘다 사용가능
		Integer box5 = 20;	//Stack
		
		if(box1 == box3) {
			System.out.println("동일함");
		}
		if(box3 == box4) {
			System.out.println("동일함1");
		}
		if(box3.equals(box4)) {
			System.out.println("동일함2");
		}
		if(box1 == box4) {
			System.out.println("동일함3");
		}
		if(box3 == box5) {
			System.out.println("동일함4");
		}
		System.out.println(box4);
	}

}
