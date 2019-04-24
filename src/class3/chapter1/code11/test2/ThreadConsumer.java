package class3.chapter1.code11.test2;

public class ThreadConsumer extends Thread{
	private Consumer consumer;
	public ThreadConsumer(Consumer consumer){
		super();
		this.consumer = consumer;
	}
	
	
	@Override
	public void run() {
		while(true){
			consumer.getValue();;
		}
	}
}
