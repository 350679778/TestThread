package class4.chapter1.code7;

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
		MyThreadA a = new MyThreadA(service);
		a.start();
		MyThreadB b = new MyThreadB(service);
		b.start();
	}

}
