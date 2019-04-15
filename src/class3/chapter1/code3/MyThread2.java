package class3.chapter1.code3;

public class MyThread2 extends Thread {
	private Object lock;
	public MyThread2(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("¿ªÊ¼ notify time="+System.currentTimeMillis());
			lock.notify();
			System.out.println("½áÊø notify time="+System.currentTimeMillis());
		}
	}
}
