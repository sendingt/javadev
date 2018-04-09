package interestingThings;

public class Three {

	public static One yes;
	String name = "name";

	int[] names;

	public void checkParametersAndArguments(int a, int b, int c, int[] name, Two check) {

		a = 2018;
		System.out.println("value of a" + a);

		System.out.println(a + " " + b + " " + c + " " + name);
		// check.checkParametersAndArguments(a, b, c, name, check);
		check.passingObjectCheck();
		System.out.println("check this dude" + check.getClass());
		System.out.println(check.toString());
		System.out.println("hjgfhjgfjhgfa");
		for (int i : name) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		yes.message();
		yes.omg();
		System.out.println(yes);

		Three referenceobj = new Three();
		Two objPassing = new Two();
		Object obj;

		int x = 20009;

		int[] arg = { 1, 2, 4, 5, 6, 7 };
		referenceobj.checkParametersAndArguments(x, 20, 4000000, arg, objPassing);
		System.out.println("value od x is" + x);

	}

}
