package instance;

public class Simple {
	void message(){System.out.println("Hello Java");} 
	
	public static void main(String[] args) throws ClassNotFoundException {
		Simple s = new Simple();
	
		
		
		Class c = Class.forName("instance.Test");
		try {
			Test t = (Test)c.newInstance();
			t.hello();
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
