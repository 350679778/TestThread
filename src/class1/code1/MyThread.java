package class1.code1;

public class MyThread extends Thread{
	private int i = 5;
	
	@Override
	public synchronized void run() {
		System.out.println("i="+(i--)+" threadName="
				+ Thread.currentThread().getName());
	}
}
