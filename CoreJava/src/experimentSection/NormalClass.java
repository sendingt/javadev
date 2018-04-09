package experimentSection;

public class NormalClass extends AstractIMyOwnInterface implements IMyOwnInterface{
	

	
	public static void main(String[] args) {
		String name= "Really";
		
		NormalClass my = new NormalClass();
		my.age();
		my.lang();

		
	}

	@Override
	public void lang() {
		System.out.println("language");
		
	}

}
