package covariant;

class A {
	A get() {
		return this;
	}
}

public class CovariantExample extends A {
	CovariantExample get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new CovariantExample().get().message();
	}
}