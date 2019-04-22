package class3.chapter1.code6;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock){
		super();
		this.lock = lock;
	}
	
	
	@Override
	public void run() {
		synchronized(lock){
			lock.notify();
		}
	}
}
