package class2.chapter2.code4;

public class Task {
	public void doLongTimeTask(){
		for (int i = 0; i < 100; i++) {
			System.out.println("nosynchronized threadName="
					+ Thread.currentThread().getName() + " i=" + (i+1));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		synchronized(this){
			for (int i = 0; i < 100; i++) {
				System.out.println("synchronized threadName="
						+ Thread.currentThread().getName() + " i=" + (i+1));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
