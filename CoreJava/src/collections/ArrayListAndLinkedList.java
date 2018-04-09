package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {
	public static void main(String[] args) {
		ArrayListAndLinkedList really = new ArrayListAndLinkedList();
		really.check();
		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(1, "uday");

		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");
		
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.addAll(al);
		
		
		
	//	al.addAll(set);
		System.out.println("This is set");
		for (String string : set) {

			System.out.println(string);

		}

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
	}

	public void check() {
		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");
		System.out.println("This is from check method");
		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
		System.out.println("End of check method");

	}

}
