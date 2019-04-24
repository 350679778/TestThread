package class3.chapter1.code11.test4;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<String> list = new ArrayList<String>();
	synchronized public void push(){
		try {
			if(list.size() == 1){
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notify();
			System.out.println("push="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try {
			if(list.size() == 0){
				System.out.println("pop�����еģ�"
						+ Thread.currentThread().getName() + " �̳߳�wait״̬");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop=" + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
