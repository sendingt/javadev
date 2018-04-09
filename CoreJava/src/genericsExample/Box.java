package genericsExample;

public class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}

	public static void main(String[] args) {
		Box bb = new Box();
		bb.set("1212dasd");
		System.out.println(bb.get());

	}

}
