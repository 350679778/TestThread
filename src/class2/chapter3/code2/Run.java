package class2.chapter3.code2;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		System.out.println("��Ҫֹͣ���� stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
