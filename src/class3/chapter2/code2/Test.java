package class3.chapter2.code2;

/**
 * @author ������
 * ����join��������ʹ�������̶߳���x����ִ��run()
 * �����е����񣬶�ʹ��ǰ�߳�z���������ڵ��������ȴ��߳�x���ٺ�
 * �ڼ���ִ���߳�z����Ĵ���
 * 
 * ����join����ʹ�߳��Ŷ����е����ã���Щ����ͬ��������Ч����join
 * ��synchronized�������ǣ�join���ڲ�ʹ��wait()�������еȴ�����
 * synchronized�ؼ���ʹ�õ��ǡ������������ԭ����Ϊͬ��
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		threadTest.join();
		System.out.println("���뵱threadTest����ִ����Ϻ�����ִ�У���������");
	}
}
