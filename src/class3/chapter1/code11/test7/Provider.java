package class3.chapter1.code11.test7;

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
