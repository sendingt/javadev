package exceptionHandling;

public class CheckingThrows{
	
	int i =5/0;
	public static void main(String[] args) throws ArithmeticException {
		CheckingThrows c = new CheckingThrows();
		System.out.println(c.i);
	}

}
