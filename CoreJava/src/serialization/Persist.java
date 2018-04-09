package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
	 public static void main(String args[])throws Exception{  
		  Student s1 =new Student(211,"ravi","java",120);  
		  
		  FileOutputStream fout=new FileOutputStream("C:/Users/udayb/OneDrive/Desktop/testOut10.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");  
		 }  

}
