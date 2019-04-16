package class2.chapter3.code7;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.runMethod();
	}
}
