package class1.code1;

public class Run {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		MyThread run = new MyThread();	
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

	private static void demo2() {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}

	private static void demo1() {
		MyThread myThread = new MyThread();	
		
		Thread a = new Thread(myThread,"A");
		Thread b = new Thread(myThread,"B");
		Thread c = new Thread(myThread,"C");
		Thread d = new Thread(myThread,"D");
		Thread e = new Thread(myThread,"E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}


}
