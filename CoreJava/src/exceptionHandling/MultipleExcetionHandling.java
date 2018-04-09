package exceptionHandling;

public class MultipleExcetionHandling {
	public static void main(String args[]){
		try {
			System.out.println("==========");
		//	int a[] = new int[5];
			//a[5] = 30/2;
			int i = 10/0;
			System.out.println("=========="+i);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("common task completed");
		e.printStackTrace();
		} 
		catch (Exception e)
		{
			System.out.println("common task completed");
		e.printStackTrace();
		} 
	
			System.out.println("rest of the code...");
		
	}
}
