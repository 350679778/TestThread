package class3.chapter2.code2;

/**
 * @author 王任重
 * 方法join的作用是使所属的线程对象x正常执行run()
 * 方法中的任务，而使当前线程z进行无限期的阻塞，等待线程x销毁后
 * 在继续执行线程z后面的代码
 * 
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果。join
 * 与synchronized的区别是：join在内部使用wait()方法进行等待，而
 * synchronized关键字使用的是“对象监视器”原理作为同步
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		threadTest.join();
		System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
	}
}
