package class3.chapter1.code3;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn����");
			synchronized(lock){
				System.out.println("syn��һ��");
				lock.wait();
				System.out.println("wait�µĴ���");
			}
			System.out.println("syn ����Ĵ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
