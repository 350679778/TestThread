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
					System.out.println("������ "
							+ Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				System.out.println("������ "+Thread.currentThread().getName()
						+" RUNNABLE ��");
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
