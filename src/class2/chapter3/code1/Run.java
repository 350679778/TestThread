package class2.chapter3.code1;

/**
 * 
 * @author ������
 * ����ʼ���к󣬸���ͣ������
 * ��Ϊmain�߳�һֱ�ڴ���while����ѭ�������³����ܼ���ִ�к���Ĵ��롣
 * ����ķ������ö��̼߳���
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("��Ҫֹͣ���� stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
