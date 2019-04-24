package class4.chapter2.code1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();
			System.out.println("»ñµÃ¶ÁËø " + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
}
