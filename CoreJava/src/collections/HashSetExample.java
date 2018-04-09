package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		Set<String> set = new HashSet<>();
		List<String> al = new ArrayList<>();
		al.addAll(set);
		al.add("Ravi");
		al.add("Vijasdy");
		al.add("Ajay");
		System.out.println("THis is ArrayList");
		for (String string : al) {
			System.out.println("  hello                  "+string);
		}
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		try {
			set.addAll(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
		set.addAll(al);
		// Traversing elements
		for (String string : set) {
			
			System.out.println("Hey"+string);
			
		}
		
		
		Set<String> linkSet = new LinkedHashSet<>();
		linkSet.add("This");
		linkSet.add("is");
		linkSet.add("This");
		//linkSet.add(null);
		
		for (String string : linkSet) {
			
			System.out.println(string);
			
		}
		Set<String> treeSet = new TreeSet<>();
		treeSet.addAll(set);
		for (String string : treeSet) {
			System.out.println(string);
		}
		
	}

}
