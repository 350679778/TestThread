package code1c2;

public class BLogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
