package class3.chapter1.code10;

public class ThreadSubtract extends Thread{
	private Subtract r;
	public ThreadSubtract(Subtract r){
		super();
		this.r = r;
	}
	
	
	@Override
	public void run() {
		r.subtract();
	}
}
