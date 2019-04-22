package class3.chapter1.code4.test1;

public class ThreadB extends Thread{
	private Object lock;
	public ThreadB(Object lock){
		super();
		this.lock = lock;
	}
	
	
	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
