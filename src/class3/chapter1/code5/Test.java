package class3.chapter1.code5;

/**
 * 
 * @author ������
 * 1.ִ����ͬ�������ͻ��ͷŶ������
 * 2.��ִ��ͬ�������Ĺ����У������쳣�������߳���ֹ����Ҳ�ᱻ�ͷš�
 * 3.��ִ��ͬ�������Ĺ����У�ִ���������������wait()���������
 * �̻߳��ͷŶ����������̶߳��������̵߳ȴ����У��ȴ������ѡ�
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
