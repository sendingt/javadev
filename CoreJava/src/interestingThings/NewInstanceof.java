package interestingThings;

public class NewInstanceof {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("interestingThings.Simple");
			Simple S = (Simple) c.newInstance();
			S.message();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Simple {
	void message() {
		System.out.println("Hello Java");
	}
}
