package interfaceExamples;



interface Printable {
	void print();
}

interface Showable {
	void print();
	void show();
}

interface K extends Showable,Printable{
	
	void display();
	
}

class MultipleInheritance implements Printable, Showable,K{
	/*public void print() {
		System.out.println("Hello");
	}*/

	public static void main(String args[]) {
		MultipleInheritance obj = new MultipleInheritance();
		Printable p = new MultipleInheritance();
		Showable s = new MultipleInheritance();
		K kobjj = (K) new MultipleInheritance();
		
		kobjj.print();
		kobjj.show();
		kobjj.display();
		/*p.print();
		s.print();
		s.show();*/
		obj.display();
		
		//obj.print();
	}

	@Override
	public void print() {
		System.out.println("@ override");
		
	}

	@Override
	public void show() {
	System.out.println("from show");
		
	}

	@Override
	public void display() {
		System.out.println("from display");
		
	}
}