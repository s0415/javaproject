package Network;

public class Thread1 {

	public static void main(String[] args) {
		int w =0;
		while(w<6) {
			box b= new box(w);
			Thread t = new Thread (b);
			t.start();
			//b.run();
			w++;
		}
	}

}
class box extends Thread{
	int no;
	public box(int a) {	//setter
		this.no = a;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(this.no);
	}
}