package class3.chapter1.code11.test2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Provider provider = new Provider(lock);
		Consumer consumer = new Consumer(lock);
		ThreadProvider[] providerThread = new ThreadProvider[2];
		ThreadConsumer[] consumerThread = new ThreadConsumer[2];
		for (int i = 0; i < 2; i++) {
			providerThread[i] = new ThreadProvider(provider);
			providerThread[i].setName("生产者" + (i+1));
			consumerThread[i] = new ThreadConsumer(consumer);
			consumerThread[i].setName("消费者" + (i+1));
			providerThread[i].start();
			consumerThread[i].start();
		}
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread()
		              .getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}
}
