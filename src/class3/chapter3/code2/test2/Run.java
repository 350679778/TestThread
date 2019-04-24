package class3.chapter3.code2.test2;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB();
			b.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
