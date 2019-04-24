package class3.chapter1.code11.test1;

public class Consumer {
	private String lock;
	public Consumer(String lock){
		super();
		this.lock = lock;
	}
	
	public void getValue(){
		try {
			synchronized(lock){
				if(ValueObject.value.equals("")){
					lock.wait();
				}
				System.out.println("getµÄÖµÊÇ£º"+ValueObject.value);
				ValueObject.value = "";
				lock.notify();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
