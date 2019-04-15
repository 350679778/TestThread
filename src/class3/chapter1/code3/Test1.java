package class3.chapter1.code3;

public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
