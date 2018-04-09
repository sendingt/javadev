package objectCreation;

public class StaticClass {
	
	static String greeting ="hello";
	static int number=1;
	static int result;
	static int change()
	{
	System.out.println("number \n"+ number + "\n greeting \n" + greeting);
	return 10;	
	}
	
	
	public static void main(String[] args) {
		result=change();
		System.out.println(result);
		
	}

}
