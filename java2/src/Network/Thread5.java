package Network;

public class Thread5 {
	//멀티 Thread 응용편
	/*
	응용문제1. 멀티쓰레드를 이용하여 각각의 구구단을 출력한느 프로세서를 제작하시오.
	첫번째 스레드에는 구구단 5단, 두번째 스레드에는 구구단9단 출력
	*/

	public static void main(String[] args) {
		Runnable gugu1 = new gugu5();
		Thread th1 = new Thread(gugu1);
		th1.start();
		
		Thread th2 = new gugu9();
		th2.start();

	}

}
class gugu5 implements Runnable {
	public void run() {
		int a=5;
		int b=1;
		int sum5=1;
		do {
			sum5=a*b;
			System.out.println(a+"*"+b+"="+sum5);
			b++;
		}while(b<10);
	}
}
class gugu9 extends Thread{
	@Override
	public void run() {
		int aa=9;
		int bb=1;
		int sum9=1;
		do {
			sum9=aa*bb;
			System.out.println(aa+"*"+bb+"="+sum9);
			bb++;
		}while(bb<10);
	}
}