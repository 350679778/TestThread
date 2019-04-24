package class4.chapter2.code4;

public class ThreadA extends Thread{
	private Service service;
	
	public ThreadA(Service service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.read();
	}
}
