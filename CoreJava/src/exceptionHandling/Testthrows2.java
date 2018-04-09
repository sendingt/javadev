package exceptionHandling;

import java.io.IOException;

class Test  {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

 class Testthrows2 {
	public static void main(String args[]) {
		try {
			Test m = new Test();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}

}
