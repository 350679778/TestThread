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
					System.out.println("������ "
							+ Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				System.out.println("������ "+ Thread.currentThread().getName()
						+ " RUNNABLE�� ");
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
