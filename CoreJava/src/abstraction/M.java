package abstraction;

public class M extends AbstractionOfA{

	@Override
	public void b() {
	System.out.println("i am from b");
		
	}

	@Override
	public void c() {
		System.out.println("i am from c");
		
	}

	@Override
	public void d() {
		System.out.println("i am from d");
		
	}
	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}

}
