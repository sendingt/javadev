package stringExample;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	 
		 public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("my name is Bebbo"," ");
		   StringTokenizer st1 = new StringTokenizer("my,name,is,Bebbo");
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		     System.out.println("Next token is : " + st1.nextToken(","));
		   }

}
