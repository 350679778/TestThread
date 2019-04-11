package class2.chapter1.code5;

public class ThreadA extends Thread {
	private PublicVar publicVar;
	public ThreadA(PublicVar publicVar){
		super();
		this.publicVar = publicVar;
	}
	
	@Override
	public void run() {
		super.run();
		publicVar.setValue("BB", "BB");
	}
}
