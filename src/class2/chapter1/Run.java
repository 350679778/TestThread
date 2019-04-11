package class2.chapter1;

public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
		ThreadA aThread = new ThreadA(numRef1);
		aThread.start();
		ThreadB bThread = new ThreadB(numRef2);
		bThread.start();
	}
}
