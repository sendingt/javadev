package coreJava;

import java.io.IOException;

public class Parent {

	  void msg(){System.out.println("parent");}  
	  
	  
	static class TestExceptionChild1 extends Parent{  
	  void msg()throws ArithmeticException{  
	    System.out.println("child");  
	  }  
	  public static void main(String args[]){  
	   Parent p=new TestExceptionChild1();  
	   p.msg();  
	  } 

}
}