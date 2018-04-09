package methodOverloading;

public class Adder {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a,double b, double c ){
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(20, 30));
		System.out.println(add(50, 40, 20));
		System.out.println(add(2,4,2));
	}

}
