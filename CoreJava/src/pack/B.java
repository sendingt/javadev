package pack;

import mypack1.A;
import mypack1.subpackage.AAA;

public class B {
	
	private String name;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		A obj = new mypack1.A();
		AAA objAAA = new AAA();
		objAAA.msgAAA();
		obj.msg();
		B oooob = new B();
		oooob.setName("Hey Dude");
		System.out.println(oooob.getName());
		
	}

}
