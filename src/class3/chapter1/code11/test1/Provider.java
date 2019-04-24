package class3.chapter1.code11.test1;

public class Provider {
	private String lock;
	public Provider(String lock){
		super();
		this.lock = lock;
	}
	
	public void setValue(){
		try {
			synchronized(lock){
				if(!ValueObject.value.equals("")){
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("setµÄÖµÊÇ£º"+value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
