package class2.chapter1.code5;

public class Run {
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();
			Thread.sleep(1000);//��ӡ����ܴ�ֵ��СӰ��
			publicVarRef.getValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
