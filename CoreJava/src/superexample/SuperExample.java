package superexample;


class Generic{
	String color = "generiCColor";
}

class Animal extends Generic{
	String color = "white";
	
	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
		super.printColor();
	}
}

class SuperExample {
	public static void main(String args[]) {
		Dog d = new Dog();
		//Animal A = new Animal();
		//A.printColor();
		
		d.printColor();
	}
}

