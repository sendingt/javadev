package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

	/*	for (String string : al) {

			System.out.println(string);

		}*/
		al.addLast("LAst Fellow");
		al.addFirst("First Fellow");
		
		for (String string : al) {
			
			System.out.println(string);
			
		}
		
		System.out.println(al.size());
		System.out.println(al.get(0));

	}

}
