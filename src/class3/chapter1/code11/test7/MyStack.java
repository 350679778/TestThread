package class3.chapter1.code11.test7;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<String> list = new ArrayList<String>();
	synchronized public void push(){
		try {
			while(list.size() == 1){
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notifyAll();
			System.out.println("push="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try {
			while(list.size() == 0){
				System.out.println("pop操作中的："
						+ Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
