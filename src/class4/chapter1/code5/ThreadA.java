package class4.chapter1.code5;

public class ThreadA extends Thread{
	private MyService service;
	
	public ThreadA(MyService service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.awaitA();
	}
}
