package class3.chapter2.code1;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			int secondValue = (int)(Math.random() * 10000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
