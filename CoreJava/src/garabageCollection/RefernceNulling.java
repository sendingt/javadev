package garabageCollection;

public class RefernceNulling {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		RefernceNulling r = new RefernceNulling();
		RefernceNulling r2 = new RefernceNulling();
		RefernceNulling r3 = new RefernceNulling();
		
		StringBuilder s =new StringBuilder("uday");
		
		r = null;
		System.out.println(r);
		r2 = null;;
		System.out.println(r2);
		//r = r2;
		r3=null;

		System.out.println(r3);
		System.gc();

	}
}
