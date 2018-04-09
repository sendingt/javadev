package exceptionHandling;

import java.io.IOException;

public class ThrowsExample {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
		Test();
	}

	void Test() throws IOException {
		// System.out.println("hello");
		throw new IOException("hello");
	}

	void p() throws IOException {
		try {
			n();
			Test();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

	}

	public static void main(String args[]) throws IOException {
		ThrowsExample obj = new ThrowsExample();
		obj.p();

		System.out.println("normal flow...");
	}

}
