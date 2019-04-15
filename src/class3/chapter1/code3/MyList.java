package class3.chapter1.code3;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private static List list = new ArrayList();
	public static void add(){
		list.add("anyString");
	}
	
	public static int size(){
		return list.size();
	}
}
