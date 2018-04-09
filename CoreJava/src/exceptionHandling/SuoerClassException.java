package exceptionHandling;

import java.io.IOException;

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

class SuoerClassException extends Parent {
	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) throws IOException {
		Parent p = new SuoerClassException();
		p.msg();
	}
}