package functions;

import java.util.ArrayList;
import java.util.List;

public class TestingMethods {

	public String name(String name) {
		System.out.println("Entered name is:" + name);
		return name;

	}

	public int age(int age) {
		System.out.println("entered age is :" + age);
		return age;

	}

	public String something(String namee) {
		return namee;

	}

	public static void main(String[] args) {
		TestingMethods t = new TestingMethods();
		t.name("uday");
		t.age(21);

		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);
		System.out.println(s);
	}

}
