package class3.chapter3.code2.test2;

import java.util.Date;

public class ThreadA extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Tools.tl.set(new Date());
				System.out.println("A "
						+ Tools.tl.get().getTime());
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
