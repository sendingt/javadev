package equals;

public class Wquals {

	String name = "uday";
	String AnotherName = "vignesh";
	
	int number = 10;
	
	public static void main(String[] args) {
		Wquals w = new Wquals();
		Wquals w2 = new Wquals();
		System.out.println(w);
		System.out.println(w2);
		System.out.println(w.name.equals(w2.name));
		System.out.println(w.equals(w2));
	}
	
}
