package class5.chapter1.code1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {
	private static Timer timer = new Timer();
	static public class MyTask extends TimerTask{
		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2019-04-24 15:22:59";
			Date dateRef = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + dateRef.toLocaleString() + " ��ǰʱ�䣺"
					+ new Date().toLocaleString());
			timer.schedule(task, dateRef);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
