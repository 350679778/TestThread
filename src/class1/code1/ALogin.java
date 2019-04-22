package class1.code1;

public class ALogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
