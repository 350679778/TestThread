package class2.chapter3.code6;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread[] array = new MyThread[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
