package class2.chapter3.code5;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 使用原子类{@link AtomicInteger}进行i++操作
 * @author 王任重
 *
 */
public class AddCountThread extends Thread {
	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}
	
}
