package multiThreading;

public class MultiThreadImplementingRunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running...");  
		
	}

	public static void main(String args[]){  
		MultiThreadImplementingRunnableInterface m1=new MultiThreadImplementingRunnableInterface();
		System.out.println(m1);
		Thread t1 =new Thread(m1);  
		t1.start();  
		 } 
}
