package collections;

public class TestGenerics4 {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };
		
		System.out.println(intArray instanceof Integer[]);

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
		System.out.println(intArray.equals(charArray));
		
		long creditCardNumber = 1234_5685_9012_3456L;
		System.out.println(creditCardNumber);
		
		
		int i = 10;
		String s = String.valueOf(i);
		int j= Integer.parseInt(s);
		System.out.println(s);
		System.out.println(j);
		
		int idea = Integer.valueOf(s);
		System.out.println(idea);
		
		String vignesh = "1235";
		int checkVale = Integer.valueOf(vignesh);
		System.out.println(checkVale);
		
		char a ='b';
		String sz = String.valueOf(a);
		System.out.println(sz);
		
		String immutable ="i am not changed";
		
		immutable.concat("Adding value at the end");
	
		System.out.println(immutable);
		
		StringBuilder mutable = new StringBuilder("i am not changed");
		mutable.append("I am changed Man");
		System.out.println(mutable);
		
		int uday = Integer.valueOf(200);
		System.out.println(uday);
		Integer vig = Integer.valueOf(300);
		System.out.println(vig);
		
		int pri =vig.intValue();
		System.out.println(pri);
		
		String pleaseObserveTHis ="vignesh";
		String checkThis = new String("Shocked");
		
		int asdf = 200;
		Integer asddd = new Integer(300);
		
	
		
		System.out.println(pleaseObserveTHis);
		System.out.println(checkThis);
		
		
		}

}
