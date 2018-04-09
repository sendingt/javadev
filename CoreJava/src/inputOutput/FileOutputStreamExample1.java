package inputOutput;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("C:/Users/udayb/OneDrive/Desktop/testOut3.txt");    
           fout.write(66);    
           fout.close();    
           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}    
    }    
} 


