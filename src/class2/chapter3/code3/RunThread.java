package class2.chapter3.code3;
/**
 * 
 * @author ������
 * ��volatile�ؼ��֣���Ҫ�����þ��ǵ��̷߳���isRunning�������ʱ��
 * ǿ���Դӹ�����ջ�н���ȡֵ
 * 1���ؼ���volatile���߳�ͬ����������ʵ�֣�����volatile���ܿ϶���
 * synchronizedҪ�ã�����volatileֻ���������������synchronized
 * �������η������Լ�����顣����JDK�°汾�ķ�����synchronized�ؼ�
 * ����ִ��Ч���ϵõ��ܴ��������ڿ�����ʹ��synchronized�ؼ��ֵı���
 * ���ǱȽϴ�ġ�
 * 2�����̷߳���volatile���ᷢ����������synchronized�����������
 * 3��volatile�ܱ�֤���ݵĿɼ��ԣ������ܱ�֤ԭ���ԣ���synchronized
 * ���Ա�֤ԭ���ԣ�Ҳ���Լ�ӱ�֤�ɼ��ԣ���Ϊ����˽���ڴ�͹����ڴ��е�
 * ������ͬ����
 * 4���ؼ���volatile������Ǳ����ڶ���߳�֮��Ŀɼ��ԣ���synchronized
 * �ؼ��ֽ�����Ƕ���߳�֮�������Դ��ͬ����
 * 
 * �̰߳�ȫ����ԭ���ԺͿɼ����������棬java��ͬ�����ƶ���Χ������������
 * ��ȷ���̰߳�ȫ�ġ�
 */
public class RunThread extends Thread {
	private volatile boolean isRunning = true;
	public boolean isRunning(){
		return isRunning;
	}
	
	public void setRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("���� run ��");
		while(isRunning == true){
		}
		System.out.println("�̱߳�ֹͣ�ˣ�");
	}
}
