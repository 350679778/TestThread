package class3.chapter3.code3;

public class ThreadLocalExt extends ThreadLocal<String> {
	@Override
	protected String initialValue() {
		return "����Ĭ��ֵ����һ��get����Ϊnull";
	}
}
