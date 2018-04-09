package exceptionHandling;

import java.io.IOException;

class M{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	class Testthrows3{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     try {
			m.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}  
	  
	    System.out.println("normal flow...");  
	  }  
	} 