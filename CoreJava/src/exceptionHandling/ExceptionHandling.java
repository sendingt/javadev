package exceptionHandling;

public class ExceptionHandling {

	public static void main(String args[]) {
		ExceptionHandling ee = new ExceptionHandling();
		int data = 50 / 0;
		/*try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.hashCode());
			//ee = e;
			System.out.println(e instanceof ArithmeticException);
		}*/
		System.out.println("rest of the code...");
	}

}
