package class4.chapter1.code8;

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
		MyThreadA[] threadA = new MyThreadA[10];
		MyThreadB[] threadB = new MyThreadB[10];
		for (int i = 0; i < 10; i++) {
			threadA[i] = new MyThreadA(service);
			threadB[i] = new MyThreadB(service);
			threadA[i].start();
			threadB[i].start();
		}
	}
}
