package class3.chapter1.code3;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn上面");
			synchronized(lock){
				System.out.println("syn第一行");
				lock.wait();
				System.out.println("wait下的代码");
			}
			System.out.println("syn 下面的代码");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
