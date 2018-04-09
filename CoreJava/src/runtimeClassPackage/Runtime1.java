package runtimeClassPackage;

public class Runtime1 {
	public static void main(String args[]) throws Exception {
		Runtime r = Runtime.getRuntime();
		Runtime.getRuntime().exec("notepad");// will open a new notepad
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Total Memory: "+r.totalMemory());
		System.out.println("Total Memory: "+r.freeMemory());
		System.gc();
		System.out.println("Total Memory: "+r.freeMemory());
		
	}

}
