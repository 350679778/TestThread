package class4.chapter2.code4;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();
			System.out.println("获得读锁 " + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
	
	public void write(){
		try {
			lock.writeLock().lock();
			System.out.println("获得写锁 " + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
