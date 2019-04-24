package class3.chapter1.code11.test5andtest6;

public class Provider {
	private MyStack myStack;
	public Provider(MyStack myStack){
		super();
		this.myStack = myStack;
	}
	
	public void pushService(){
		myStack.push();
	}
}
