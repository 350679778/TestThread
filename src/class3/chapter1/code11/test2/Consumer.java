package class3.chapter1.code11.test2;

public class Consumer {
	private String lock;
	public Consumer(String lock){
		super();
		this.lock = lock;
	}
	
	public void getValue(){
		try {
			synchronized(lock){
				while(ValueObject.value.equals("")){
					System.out.println("消费者 "
							+ Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费者 "+Thread.currentThread().getName()
						+" RUNNABLE 了");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
