package class3.chapter1.code4.test2;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock){
		super();
		this.lock = lock;
	}
	
	
	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
