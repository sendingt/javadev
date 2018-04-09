package conversions;

public class StringToObjectExample {
	public static void main(String args[]) throws Exception{  
		String s="hello";  
		Object obj=s;  
		System.out.println(obj); 
		
		StringToObjectExample ob = new StringToObjectExample();
		Class c = Class.forName("java.lang.String");
		System.out.println("class name " +c.getName());
		
		}

}
