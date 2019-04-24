package class4.chapter1.code8;

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
