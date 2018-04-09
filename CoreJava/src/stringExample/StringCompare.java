package stringExample;

public class StringCompare {
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("rachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equalsIgnoreCase(s3));// true
		System.out.println(s1.equals(s4));// false
		System.out.println("---------"+s1.equals(s3));
		System.out.println("++++++++++++++++++++++++++++++++++++");
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
		   System.out.println(s1.compareTo(s3));
		
		
		
	}

}
