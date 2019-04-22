package class3.chapter1.code5;

/**
 * 
 * @author 王任重
 * 1.执行完同步代码块就会释放对象的锁
 * 2.在执行同步代码块的过程中，遇到异常而导致线程终止，锁也会被释放。
 * 3.在执行同步代码块的过程中，执行了锁所属对象的wait()方法，这个
 * 线程会释放对象锁，而线程对象会进入线程等待池中，等待被唤醒。
 */
public class Test {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
