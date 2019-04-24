package class3.chapter3.code4;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal<Object> {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
