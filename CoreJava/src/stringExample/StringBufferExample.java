package stringExample;

public class StringBufferExample {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");
		StringBuffer ss = new StringBuffer();
		sb.append("Java");//now original string is changed  
		System.out.println(sb.toString());//prints Hello Java 
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		long startTime=System.currentTimeMillis();
		System.out.println(ss.capacity()+System.currentTimeMillis()-startTime);
		
		}  

}
