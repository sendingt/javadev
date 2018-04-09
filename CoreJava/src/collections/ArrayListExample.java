package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		List<Integer> InAl = new ArrayList<>();
		List<String> al_2 = new ArrayList<>();
		
		al.add("hi");
		al.add("Dude");
		al.add("How are you da");
		InAl.add(1);
		InAl.add(2);
		InAl.add(1);
		al_2.add("hi");
		al_2.add("Dude");
		al_2.add("How are you da");
		al.addAll(al_2);
		
		System.out.println(al.toArray());
		
		/*String[] really = (String[]) al.toArray();
		
		for (String string : really) {
			
			System.out.println("================================"+string);
			
		}*/
		
		
		
		for (String string : al) {
			
			System.out.println(string);
			
		}
		for (Integer integer : InAl) {
			System.out.println(integer);
			
		}
	}

}
