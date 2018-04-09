package conversions;

public class StringToIntegerExample2 {
	public static void main(String args[]) {
		String s = "200";
		int i = Integer.parseInt(s);
		System.out.println(i);
		int j=300;
		String t= String.valueOf(j);
		String u =Integer.toString(j);
		System.out.println(t);
		System.out.println(u);
		System.out.println(t instanceof String);
		String v=String.format("%d",i);  
		System.out.println(v);
		String w="9990449935";  
		long l=Long.parseLong(w);  
		System.out.println(l);
		long k = 666666666666L;
		String x = Long.toString(k);
		System.out.println(k);
		System.out.println(x);
		boolean b1=true;  
		boolean b2=false;  
		String s1=String.valueOf(b1);  
		String s2=String.valueOf(b2);  
		System.out.println(s1);  
		System.out.println(s2);
		System.out.println(b1);
		
		
		
	}

}
