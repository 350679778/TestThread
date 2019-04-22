package class3.chapter1.code4.test1;

public class Service {
	public void testMethod(Object lock){
		try {
			synchronized(lock){
				System.out.println("begin wait()");
				Thread.sleep(4000);
				System.out.println("end wait()");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
