package class2.chapter1.code6;

public class MyThread extends Thread {

//	@Override
//	public void run() {
//		Service service = new Service();
//		service.service1();
//	}
	
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
