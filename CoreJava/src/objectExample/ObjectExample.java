package objectExample;

import java.util.ArrayList;
import java.util.List;

import interestingThings.MyOwnClass;

public class ObjectExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Throwable {
		Object obj = null;
		ObjectExample o = new ObjectExample();
		// obj.getClass();
		o.getClass();
		System.out.println(o.getClass());
		MyOwnClass c = new MyOwnClass();
		System.out.println(c.getClass());
		System.out.println(o.hashCode());
		System.out.println(c.hashCode());
		System.out.println(o.equals(c));
		System.out.println(o.toString());
		o.finalize();
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);
		System.out.println(s);
		List<String> lists = new ArrayList<String>();
		lists.add("hellosss");
		String ss = lists.get(0);
		System.out.println(ss);
		
	}

}
