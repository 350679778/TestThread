package class4.chapter2.code4;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(1000);
		a.start();
	}

}
