package class3.chapter2.code3;

public class ThreadB extends Thread {
	@Override
	public void run() {
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			System.out.println("�߳�B��run end����ӡ��");
		} catch (Exception e) {
			System.out.println("�߳�B��catch����ӡ��");
			e.printStackTrace();
		}
	}
}
