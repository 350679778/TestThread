package class3.chapter1.code11.test2;

public class Provider {
	private String lock;
	public Provider(String lock){
		super();
		this.lock = lock;
	}
	
	public void setValue(){
		try {
			synchronized(lock){
				while(!ValueObject.value.equals("")){
					System.out.println("生产者 "
							+ Thread.currentThread().getName() + " WAITING了★");
					lock.wait();
				}
				System.out.println("生产者 "+ Thread.currentThread().getName()
						+ " RUNNABLE了 ");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
