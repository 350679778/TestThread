package class1.code1;

public class LoginServlet {
	private static String usernameRef;
	private static String passwordRef;
	public synchronized static void doPost(String username,String password){
		try {
			usernameRef = username;
			if(username.equals("b")){
				Thread.sleep(5000);
			}
			passwordRef = password;
			System.out.println("username="+usernameRef+" password="+passwordRef);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
