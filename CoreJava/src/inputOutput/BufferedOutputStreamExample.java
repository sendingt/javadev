package inputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("C:/Users/udayb/OneDrive/Desktop/testOut4.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		Scanner sc=new Scanner(System.in); 
		 String name=sc.next();
		//String s = "Welcome to javaDeveloper you are using BufferedOutPut StreamAccha";
		byte b[] = name.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("success");
		//System.out.println(s.getBytes());
		 

	}
}
