package transisent;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {
	public static void main(String args[]) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/udayb/OneDrive/Desktop/testOut11.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age);
		in.close();
	}

}
