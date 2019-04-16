package class2.chapter3.code1;

/**
 * 
 * @author 王任重
 * 程序开始运行后，根本停不下来
 * 因为main线程一直在处理while（）循环，导致程序不能继续执行后面的代码。
 * 解决的方法是用多线程技术
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！ stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
