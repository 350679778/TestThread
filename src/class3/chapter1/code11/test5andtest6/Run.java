package class3.chapter1.code11.test5andtest6;

public class Run {
	public static void main(String[] args) throws InterruptedException {
//		一生产多消费();
		MyStack myStack = new MyStack();
		Provider provider1 = new Provider(myStack);
		Provider provider2 = new Provider(myStack);
		Provider provider3 = new Provider(myStack);
		Provider provider4 = new Provider(myStack);
		Provider provider5 = new Provider(myStack);
		ThreadProvider providerThread1 = new ThreadProvider(provider1);
		ThreadProvider providerThread2 = new ThreadProvider(provider2);
		ThreadProvider providerThread3 = new ThreadProvider(provider3);
		ThreadProvider providerThread4 = new ThreadProvider(provider4);
		ThreadProvider providerThread5 = new ThreadProvider(provider5);
		providerThread1.start();
		providerThread2.start();
		providerThread3.start();
		providerThread4.start();
		providerThread5.start();
		Consumer consumer = new Consumer(myStack);
		ThreadConsumer consumerThread = new ThreadConsumer(consumer);
		consumerThread.start();
		
	}

	private static void 一生产多消费() {
		MyStack myStack = new MyStack();
		Provider provider = new Provider(myStack);
		Consumer consumer1 = new Consumer(myStack);
		Consumer consumer2 = new Consumer(myStack);
		Consumer consumer3 = new Consumer(myStack);
		Consumer consumer4 = new Consumer(myStack);
		Consumer consumer5 = new Consumer(myStack);
		ThreadProvider providerThread = new ThreadProvider(provider);
		providerThread.start();
		ThreadConsumer consumerThread1 = new ThreadConsumer(consumer1);
		ThreadConsumer consumerThread2 = new ThreadConsumer(consumer2);
		ThreadConsumer consumerThread3 = new ThreadConsumer(consumer3);
		ThreadConsumer consumerThread4 = new ThreadConsumer(consumer4);
		ThreadConsumer consumerThread5 = new ThreadConsumer(consumer5);
		consumerThread1.start();
		consumerThread2.start();
		consumerThread3.start();
		consumerThread4.start();
		consumerThread5.start();
	}
}
