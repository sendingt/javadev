package exceptionHandling;

public class ExceptionPropagation {

	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {

		
				n();
		
			
		
	}

	public static void main(String args[]) throws ArithmeticException{
		ExceptionPropagation obj = new ExceptionPropagation();
		
			obj.p();
		
		System.out.println("normal flow...");
	}

}
