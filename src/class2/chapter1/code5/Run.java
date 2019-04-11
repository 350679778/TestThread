package class2.chapter1.code5;

public class Run {
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();
			Thread.sleep(1000);//打印结果受此值大小影响
			publicVarRef.getValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
