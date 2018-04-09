package interestingThings;

public class InstanceIntializer {
	int speed;

	/*InstanceIntializer() {
		System.out.println("speed is " + speed);
	}*/

	{
		speed = 100;
	}
	{
		System.out.println("constructor is invoked");
	}

	//Bike8(){System.out.println("constructor is invoked");}

	{
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) {
		InstanceIntializer b1 = new InstanceIntializer();
		InstanceIntializer b2 = new InstanceIntializer();
	}

}
