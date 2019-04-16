package class2.chapter3.code1;

public class PrintString {
	private boolean isContinuePrint = true;
	public boolean isContinuePrint(){
		return isContinuePrint;
	}
	
	public void setContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod() throws InterruptedException{
		while(isContinuePrint == true){
			System.out.println("run printStringMethod threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}
