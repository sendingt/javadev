package methodOverloading;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class RuntimePolymorphism extends Bike {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike b = new RuntimePolymorphism();// upcasting
		b.run();
		System.out.println(b instanceof Bike);
		RuntimePolymorphism check = (RuntimePolymorphism) b;
		check.run();
	}
}
