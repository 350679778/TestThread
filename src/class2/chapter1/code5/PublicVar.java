package class2.chapter1.code5;

public class PublicVar {
	public String username = "A";
	public String password = "AA";
	synchronized public void setValue(String username,String password){
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name="
					+ Thread.currentThread().getName() + " username="
					+ username + " password=" + password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	synchronized public void getValue(){
		System.out.println("getValue method thread name="
				+ Thread.currentThread().getName() + " username=" + username
				+ " password=" + password);
	}
}
