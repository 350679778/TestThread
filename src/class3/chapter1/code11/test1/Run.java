package class3.chapter1.code11.test1;

public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		Provider provider = new Provider(lock);
		Consumer consumer = new Consumer(lock);
		ThreadProvider providerThread = new ThreadProvider(provider);
		ThreadConsumer consumerThread = new ThreadConsumer(consumer);
		providerThread.start();
		consumerThread.start();
	}
}
