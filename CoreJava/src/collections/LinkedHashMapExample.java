package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Vijay");
		hm.put(101, "Rahul");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Map<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(100, "Amit");
		hm1.put(102, "Vijay");
		hm1.put(101, "Rahul");
		
		System.out.println("============================================");
		for (Entry<Integer, String> m : hm1.entrySet()) {
			
			System.out.println(m.getKey() + " "+ m.getValue());
			
		}
	}

}
