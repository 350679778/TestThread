package class2.chapter3.code3;
/**
 * 
 * @author 王任重
 * 加volatile关键字，主要的作用就是当线程访问isRunning这个变量时，
 * 强制性从公共堆栈中进行取值
 * 1）关键字volatile是线程同步的轻量级实现，所以volatile性能肯定比
 * synchronized要好，并且volatile只能修饰语变量，而synchronized
 * 可以修饰方法，以及代码块。随着JDK新版本的发布，synchronized关键
 * 字在执行效率上得到很大提升，在开发中使用synchronized关键字的比率
 * 还是比较大的。
 * 2）多线程访问volatile不会发生阻塞，而synchronized会出现阻塞。
 * 3）volatile能保证数据的可见性，但不能保证原子性；而synchronized
 * 可以保证原子性，也可以间接保证可见性，因为它将私有内存和公共内存中的
 * 数据做同步。
 * 4）关键字volatile解决的是变量在多个线程之间的可见性；而synchronized
 * 关键字解决的是多个线程之间访问资源的同步性
 * 
 * 线程安全包含原子性和可见性两个方面，java的同步机制都是围绕这两个方面
 * 来确保线程安全的。
 */
public class RunThread extends Thread {
	private volatile boolean isRunning = true;
	public boolean isRunning(){
		return isRunning;
	}
	
	public void setRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("进入 run 了");
		while(isRunning == true){
		}
		System.out.println("线程被停止了！");
	}
}
