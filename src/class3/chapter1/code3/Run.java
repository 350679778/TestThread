package class3.chapter1.code3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		Thread.sleep(50);
		ThreadB b = new ThreadB(lock);
		b.start();
	}

}
