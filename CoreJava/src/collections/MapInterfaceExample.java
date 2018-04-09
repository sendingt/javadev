package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(104, "Vig");
		map.put(104, "Amit");
		map.put(104, "uday");
		
		map.put(null,null);
		map.put(106, null);
		//map.remove(104);
		System.out.println("====================");
		System.out.println("Map Values"+map);
		/*for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}*/
		
		System.out.println("iterating over the key set values");
		for (Integer keys : map.keySet()) {
			
			System.out.println("Key Value"+keys);
			
		}
		
		System.out.println("==========================================");
		
		System.out.println("Iterating over the Vlaues");
		for (String string : map.values()) {
			
			System.out.println("value is"+string);
			
		}
		System.out.println("=============================================");
		
	
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Iterating over the entry ");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
