package class3.chapter1.code5;

public class ThreadA extends Thread{
	private Object lock;
	public ThreadA(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
