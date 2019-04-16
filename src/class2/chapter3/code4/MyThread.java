package class2.chapter3.code4;

public class MyThread extends Thread {
	//注意一定要添加static关键字
	//这样synchronized与static锁的内容太就是MyThread.class类了
	//也就达到同步的效果了
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
