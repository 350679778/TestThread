package class2.chapter3.code6;

public class MyThread extends Thread {
	private MyService myService;
	public MyThread(MyService myService){
		super();
		this.myService = myService; 
	}
	
	@Override
	public void run() {
		myService.addNum();
	}
}
