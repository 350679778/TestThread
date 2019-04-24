package class4.chapter1.code2;

public class ThreadBB extends Thread{
	private MyService service;
	
	public ThreadBB(MyService service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.methodB();
	}
}
