package class4.chapter1.code6;

/**
 * @author 王任重
 * Object类中的wait()方法相当于Condition类中的await()方法。
 * Object类中的wait(long timeout)方法相当于Condition类中的
 * await(long time,TimeuNit unit)方法。
 * Object类中的notify()方法相当于Condition类中的signal()方法。
 * Object类中的notifyAll()方法相当于Condition类中的signalAll()方法。
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(3000);
		service.signalAll_A();
	}

}
