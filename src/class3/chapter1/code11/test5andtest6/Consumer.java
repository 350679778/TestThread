package class3.chapter1.code11.test5andtest6;

public class Consumer {
	private MyStack myStack;
	public Consumer(MyStack myStack){
		super();
		this.myStack = myStack;
	}
	
	public void popService(){
		System.out.println("pop="+myStack.pop());
	}
}
