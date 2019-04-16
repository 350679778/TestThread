package class2.chapter3.code7;

/**
 * @author 王任重
 * 关键字synchronized可以保证在同一时刻，只有一个线程可
 * 以执行某一个方法或某一个代码怒爱。它包含两个特征：互斥性
 * 和可见性。同步synchronized不仅可以解决一个线程看到对象
 * 处于不一致的状态，还可以保证进入同步方法或者同步代码块的
 * 每个线程，都看到由同一个锁保护之前所有的修改效果。
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
			System.out.println("已经发起停止的命令了!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
