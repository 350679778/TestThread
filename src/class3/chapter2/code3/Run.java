package class3.chapter2.code3;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(500);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
