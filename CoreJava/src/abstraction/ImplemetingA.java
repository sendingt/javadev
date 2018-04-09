package abstraction;

public class ImplemetingA implements A{

	@Override
	public void a() {
		System.out.println("from A");
		
	}

	@Override
	public void b() {
	System.out.println("from B");
		
	}

	@Override
	public void c() {
		System.out.println("from c");
		
	}

	@Override
	public void d() {
		System.out.println("from d");
		
	}
	
	
	public static void main(String[] args) {
		ImplemetingA obj = new ImplemetingA();
		A objA = new ImplemetingA();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		objA.d();
		objA.c();
		objA.b();
		objA.a();
	}

}
