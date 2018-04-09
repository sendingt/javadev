package transisent;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistExample {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi", 22);// creating object
		// writing object into file
		FileOutputStream f = new FileOutputStream("C:/Users/udayb/OneDrive/Desktop/testOut11.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();

		out.close();
		f.close();
		System.out.println("success");
	}
}
