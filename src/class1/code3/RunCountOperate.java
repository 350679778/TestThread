package class1.code3;

public class RunCountOperate {

	public static void main(String[] args) {
		CountOperate c= new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	}
}
