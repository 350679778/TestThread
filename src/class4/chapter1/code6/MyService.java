package class4.chapter1.code6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("begin awaitAʱ��Ϊ " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
			System.out.println("  end awaitAʱ��Ϊ " + System.currentTimeMillis()
			+ " ThreadName=" + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void awaitB(){
		try {
			lock.lock();
			System.out.println("begin awaitBʱ��Ϊ " + System.currentTimeMillis()
			+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.await();
			System.out.println("  end awaitBʱ��Ϊ " + System.currentTimeMillis()
			+ " ThreadName=" + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_A(){
		try {
			lock.lock();
			System.out.println("  signalAll_A ʱ��Ϊ " + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_B(){
		try {
			lock.lock();
			System.out.println("  signalAll_B ʱ��Ϊ " + System.currentTimeMillis()
			+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}