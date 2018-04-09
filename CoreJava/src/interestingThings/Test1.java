package interestingThings;

public class Test1 {
	public static void main(String[] args) {
		new B().getA().msg();

		B bobj = new B();
		bobj.getA().msg();
		
		System.out.println(bobj+"..........this is actual reference id");
		
	}

}

class B {
	B getA() {
		return this;
	}

	void msg() {
		System.out.println(this+ "from this refernce id" );
		System.out.println("Hello java");
	}
}