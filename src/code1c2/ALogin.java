package code1c2;

public class ALogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
