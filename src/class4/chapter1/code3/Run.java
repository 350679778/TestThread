package class4.chapter1.code3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}

}
