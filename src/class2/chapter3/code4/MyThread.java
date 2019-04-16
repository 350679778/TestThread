package class2.chapter3.code4;

public class MyThread extends Thread {
	//ע��һ��Ҫ���static�ؼ���
	//����synchronized��static��������̫����MyThread.class����
	//Ҳ�ʹﵽͬ����Ч����
	volatile public static int count;
	synchronized private static void addCount(){
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count="+count);
	}
	
	@Override
	public void run() {
		addCount();
	}
}
