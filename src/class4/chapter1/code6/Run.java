package class4.chapter1.code6;

/**
 * @author ������
 * Object���е�wait()�����൱��Condition���е�await()������
 * Object���е�wait(long timeout)�����൱��Condition���е�
 * await(long time,TimeuNit unit)������
 * Object���е�notify()�����൱��Condition���е�signal()������
 * Object���е�notifyAll()�����൱��Condition���е�signalAll()������
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
