package class2.chapter2.code1;

import commonutils.CommonUtils;

public class MyThread2 extends Thread {
	private Task task;
	public MyThread2(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}