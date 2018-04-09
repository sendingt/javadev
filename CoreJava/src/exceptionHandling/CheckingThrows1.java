package exceptionHandling;

import java.io.IOException;

public class CheckingThrows1 {
	public void test() throws IOException
	{
		System.out.println("Throwing error");
		  throw new IOException("device error");  
	}

	public static void main(String[] args) throws IOException {
		CheckingThrows1 cc = new CheckingThrows1();
	
			try {
				cc.test();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception handled");
			}
	
		System.out.println("rest of the code executed");
	}
}
