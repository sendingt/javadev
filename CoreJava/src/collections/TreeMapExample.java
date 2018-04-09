package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "uday");
		treeMap.put(3, "hello");
		treeMap.put(2, "bhasker");

		for (Map.Entry<Integer, String> mapvalues : treeMap.entrySet()) {
			System.out.println(mapvalues.getKey() + " " + mapvalues.getValue());
		}
		
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "hello");
		hashMap.put(1, "uday");
		//hashMap.put(3, "hello");
		hashMap.put(null, "bhasker");
		System.out.println("=======================HASH MAP ");
		for (Map.Entry<Integer, String> hashMap1 : hashMap.entrySet()) {
			System.out.println(hashMap1.getKey() + " " + hashMap1.getValue());
		}

	}

}
