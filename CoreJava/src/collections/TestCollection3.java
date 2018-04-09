package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {
	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		Student s4 = new Student(101, "Sonoo", 23);
		Student s5 = new Student(102, "Ravi", 21);
		Student s6 = new Student(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(s4);// adding Student class object
		a2.add(s5);
		a2.add(s6);
		
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		for (Student student : al) {

			System.out.println(student.rollno + " " + student.name + " " + student.age);

		}

		System.out.println(al.get(0).name);
		System.out.println(al.set(2, s3).age);
		// System.out.println(al.remove(2));
		System.out.println(al.indexOf(al));
		System.out.println("=============");
		for (Student student : al) {

			System.out.println(student.rollno + " " + student.name + " " + student.age);

		}
		System.out.println(al.iterator().hasNext());
		System.out.println(al.indexOf(s3));
		//System.out.println(al.removeAll(al));
		System.out.println("Traversing all the elements in collection");

		for (Student student : al) {

			System.out.println(student.rollno + " " + student.name + " " + student.age);

		}

		System.out.println("retaing all");
		al.retainAll(a2);
		for (Student student : al) {

			System.out.println(student.rollno + " " + student.name + " " + student.age);

		}

	}
}
