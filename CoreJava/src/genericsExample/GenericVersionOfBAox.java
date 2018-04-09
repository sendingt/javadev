package genericsExample;

public class GenericVersionOfBAox<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	public static void main(String[] args) {
		GenericVersionOfBAox<Integer> integerBox = new GenericVersionOfBAox<>();
		GenericVersionOfBAox<String> integerBoxString = new GenericVersionOfBAox<>();
		System.out.println(integerBox instanceof GenericVersionOfBAox);
		System.out.println(integerBoxString instanceof GenericVersionOfBAox);
		
		int i = 100987879;
		integerBox.set(i);
		System.out.println(integerBox.get());
		integerBoxString.set("hai dude");
		System.out.println(integerBoxString.get());
	}
}
