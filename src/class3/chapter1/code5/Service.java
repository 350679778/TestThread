package class3.chapter1.code5;

public class Service {
	public void testMethod(Object lock){
		try {
			synchronized(lock){
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("end wait()");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����쳣�ˣ���Ϊ��wait״̬���̱߳�interrupt�ˣ�");
		}
	}
}
