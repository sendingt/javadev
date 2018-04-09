package abstraction;

abstract class Bike {
	abstract void run();
	public void hello()
	{
		System.out.println("hi dude");
	}
}

class AbstractionExample extends Bike {
	void run() {
		System.out.println("running safely..");
	}

	public static void main(String args[]) {
		Bike obj = new AbstractionExample();
		obj.run();
		obj.hello();
	}
}