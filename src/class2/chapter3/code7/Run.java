package class2.chapter3.code7;

/**
 * @author ������
 * �ؼ���synchronized���Ա�֤��ͬһʱ�̣�ֻ��һ���߳̿�
 * ��ִ��ĳһ��������ĳһ������ŭ��������������������������
 * �Ϳɼ��ԡ�ͬ��synchronized�������Խ��һ���߳̿�������
 * ���ڲ�һ�µ�״̬�������Ա�֤����ͬ����������ͬ��������
 * ÿ���̣߳���������ͬһ��������֮ǰ���е��޸�Ч����
 */
public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("�Ѿ�����ֹͣ��������!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
