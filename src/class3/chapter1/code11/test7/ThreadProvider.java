package class3.chapter1.code11.test7;

public class ThreadProvider extends Thread{
	private Provider provider;
	public ThreadProvider(Provider provider){
		super();
		this.provider = provider;
	}
	
	@Override
	public void run() {
		while(true){
			provider.pushService();
		}
	}
}