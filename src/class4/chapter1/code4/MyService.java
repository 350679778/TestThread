package class4.chapter1.code4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await(){
		try {
			lock.lock();
			System.out.println(" await 时间为 " + System.currentTimeMillis());
			condition.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal(){
		try {
			lock.lock();
			System.out.println("signal 时间为 " + System.currentTimeMillis());
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
