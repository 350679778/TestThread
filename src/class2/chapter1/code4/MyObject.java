package class2.chapter1.code4;

public class MyObject {
	public synchronized void methodA(){
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		try {
			System.out.println("begin methodB threadName="
					+ Thread.currentThread().getName()+" begin time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
