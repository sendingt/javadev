package exceptionHandling;

import java.io.IOException;

public class CheckedExceptionExample2 {
	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		
			try {
				n();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Exception handled");
			}
		
	}

	public static void main(String args[]) throws IOException {
		CheckedExceptionExample2 obj = new CheckedExceptionExample2();
		obj.p();
		System.out.println("normal flow");
	}

}
