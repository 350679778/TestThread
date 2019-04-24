package class3.chapter3.code3;

public class ThreadLocalExt extends ThreadLocal<String> {
	@Override
	protected String initialValue() {
		return "我是默认值，第一次get不再为null";
	}
}
