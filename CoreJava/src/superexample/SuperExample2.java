package superexample;

class Animal1{
	Animal1() {
		System.out.println("animal is created");
	}
}

class Dog1 extends Animal1 {
	Dog1() {
		//super.printColor();
		System.out.println("dog is created");
	}
}

class SuperExample2 {
	public static void main(String args[]) {
		Dog1 d = new Dog1();
	}
}