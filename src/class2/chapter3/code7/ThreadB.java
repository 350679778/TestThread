package class2.chapter3.code7;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.runMethod();
	}
}
