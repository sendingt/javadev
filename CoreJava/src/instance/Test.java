package instance;

public class Test {
	
	public void hello()
	{
		System.out.println("hello");
	}
	 public static void main(String args[]){  
		  try{  
		  Class c=Class.forName("instance.Simple");
		  System.out.println("=============="+c);
		  Simple s=(Simple)c.newInstance(); 
		  System.out.println(c.newInstance());
		  s.message();  
		  
		  }catch(Exception e){System.out.println(e);}  
		  
		 }  

}
