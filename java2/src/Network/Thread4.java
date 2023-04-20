package Network;

//멀티 Thread 응용편(입금/출금)
public class Thread4 {

	public static int money = 50000;	//통장잔고
	
	public static void main(String[] args) {
		
		Runnable ra2 = new outmoney();
		Thread th2 = new Thread(ra2);
		th2.start();
	
		Thread th = new inmoney();
		th.start();
	}
}
class outmoney implements Runnable{	//출금처리
	public void run() {
		int out[] = {15000,25000,16000};
		int w=0;
		do {
			Thread4.money = Thread4.money - out[w];
			System.out.println("현재 잔액은 "+Thread4.money +"원 입니다.");

			w++;
		}while(w<out.length);
	}
}

class inmoney extends Thread{	//입금처리
	
	@Override
	public void run() {
		int plusmoney = 30000;
		Thread4.money = Thread4.money+plusmoney;
		System.out.println("현재 잔액은 "+Thread4.money +"원 입니다.");
	}
	
}