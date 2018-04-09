package coreJava;

public class TestThrow1 {
	static void validate(int age) {
		if (age < 18) {
			System.out.println("please check");
			try {
				System.out.println("division by 0"+age/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw new ArithmeticException("not valid");
			
		
		} else
			try {
				System.out.println("division by 0"+age/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(17);
		System.out.println("rest of the code...");
	}
}
