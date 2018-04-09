package exceptionHandling;

public class ThrowExample {
	static void validate(int age) {
		if (age < 18)
			throw new NullPointerException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(18);
		System.out.println("rest of the code...");
	}

}
