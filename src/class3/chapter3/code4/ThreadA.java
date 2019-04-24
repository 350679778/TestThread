package class3.chapter3.code4;

import java.util.Date;

public class ThreadA extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Tools.tl.set(new Date());
				System.out.println("在ThreadA线程中取值="+Tools.tl.get());
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
