package stringExample;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s="            Sachin  Ten  dulka  rJ   i           ";  
		String s1 = new String("uday");
		String s2=s1;
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)  
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.startsWith("  "));
		System.out.println(s.endsWith("  "));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(15));
		System.out.println(s.length());
		System.out.println(s2);
		int a =10;
		String k = String.valueOf(a);
		System.out.println(k);
		String someValue="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=someValue.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString); 
	}

}
