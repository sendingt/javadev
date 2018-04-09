package interestingThings;

public class MyOwnClass implements MyOwnInterface {

	@Override
	public void name() {
		System.out.println("Hi Dude i am from Name method Implemented in My OwnClass");

	}

	@Override
	public void Age() {
		System.out.println("Hi Dude i am from Age method Implemented in My OwnClass");

	}

	public void language() {
		System.out.println("Hi Dude i am from language method and i am MyOwnClass method not implented from interface");
	}

}
