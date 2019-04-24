package class3.chapter1.code11.test4;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyStack myStack = new MyStack();
		Provider provider = new Provider(myStack);
		Consumer consumer = new Consumer(myStack);
		ThreadProvider providerThread = new ThreadProvider(provider);
		ThreadConsumer consumerThread = new ThreadConsumer(consumer);
		providerThread.start();
		consumerThread.start();
	}
}
