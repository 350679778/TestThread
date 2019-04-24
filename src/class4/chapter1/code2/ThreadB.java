package class4.chapter1.code2;

public class ThreadB extends Thread{
	private MyService service;
	
	public ThreadB(MyService service){
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.methodB();
	}
}
