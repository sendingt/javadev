package stringExample;

public class StringExample {
	public static void main(String args[]) {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		String s4 = new String();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.hashCode());
		System.out.println("gjkhgkjfgkjhgkjfg       "+s4.hashCode());
	}

}
