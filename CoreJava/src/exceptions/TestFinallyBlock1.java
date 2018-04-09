package exceptions;

import java.io.IOException;

class TestFinallyBlock1 {
	public static void main(String args[]) throws IOException {
		try {
			String data =null;
			System.out.println(data.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}
}