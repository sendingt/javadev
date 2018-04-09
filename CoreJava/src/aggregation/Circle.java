package aggregation;

public class Circle {
	 Operation op;//aggregation  
	 double pi=3.14; 
	 String name = "uday";
	    
	 double area(int radius){  
	   op=new Operation();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	  
	     
	    
	 public static void main(String args[]){  
	   Circle c=new Circle();
	   c.name = "UDAY";
	   System.out.println(c.name);
	   System.out.println(c.name.hashCode());
	   System.out.println(c.hashCode());
	   double result=c.area(5);  
	   System.out.println(result);  
	 }  

}
