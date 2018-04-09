package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
	 public static void main(String args[])throws Exception{  
		    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:/Users/udayb/OneDrive/Desktop/testOut10.txt"));  
		  Student s=(Student)in.readObject();  
		  System.out.println(s.id+" "+s.name + " " + s.course+ " "+s.fee);  
		  
		  in.close();  
		 } 

}
