package fourth;

public class A {
		public static void main(String[] args){
			MyTicket mt = new MyTicket();
			Thread t1 = new Thread(mt);
			Thread t2 = new Thread(mt);
			Thread t3 = new Thread(mt);
			Thread t4 = new Thread(mt);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
	}
}
