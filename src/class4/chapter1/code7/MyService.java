package class4.chapter1.code7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set(){
		try {
			lock.lock();
			while(hasValue == true){
				condition.await();
			}
			System.out.println("¥Ú”° °Ô ");
			hasValue = true;
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void get(){
		try{
			lock.lock();
			while(hasValue == false){
				condition.await();
			}
			System.out.println("¥Ú”° °Ó ");
			hasValue = false;
			condition.signal();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
