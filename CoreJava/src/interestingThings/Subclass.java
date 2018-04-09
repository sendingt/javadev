/**
 * 
 */
package interestingThings;

/**
 * @author udayb
 *
 */
public class Subclass extends MyOwnClass{

	/**
	 * @param args
	 */
	public void gender(){
		System.out.println("Hi dude i am from Subclass Gender Method. Dude");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass s = new Subclass();
		s.Age();
		s.name();
		s.language();
		s.gender();
		
		MyOwnInterface sI = new MyOwnClass();
		sI.Age();
		sI.name();
		
		
		MyOwnClass sC = new MyOwnClass();
		sC.Age();
		sC.name();
		sC.language();
		
		MyOwnInterface ssI = new MyOwnInterface() {
			
			@Override
			public void name() {
				System.out.println("Hi Da");
				
			}
			
			@Override
			public void Age() {
				System.out.println("Hi Da da");
				
			}
		};
		ssI.Age();
		ssI.name();
		s.Age();
		
		MyOwnClass ssC = (Subclass)new Subclass();
		ssC.Age();
		((Subclass) ssC).gender();
		
		ssC.language();
		ssC.name();
		/*
		Subclass ssd = (Subclass) new MyOwnClass();
		ssd.Age();*/
		System.out.println(s instanceof MyOwnClass);
		System.out.println(s instanceof Subclass);
		System.out.println(s instanceof MyOwnInterface);
		
		System.out.println(sC instanceof MyOwnClass);
		System.out.println(sC instanceof MyOwnInterface);
		System.out.println(sC instanceof Subclass);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(ssC instanceof MyOwnClass);
		System.out.println(ssC instanceof MyOwnInterface);
		System.out.println(ssC instanceof Subclass);
		((Subclass) ssC).gender();
		
		MyOwnInterface sssI = new Subclass();
		
		sssI.Age();
		((Subclass) sssI).gender();
		sssI.name();
		((MyOwnClass) sssI).language();
		System.out.println(ssI instanceof MyOwnClass);
		System.out.println(ssI instanceof MyOwnInterface);
		System.out.println(ssI instanceof Subclass);
		System.out.println(sssI instanceof MyOwnClass);
		System.out.println(sssI instanceof MyOwnInterface);
		System.out.println(sssI instanceof Subclass);
		
		MyOwnInterface ssssI = (Subclass)new Subclass();
		((Subclass) ssssI).gender();
		ssssI.Age();
		ssssI.name();
		((MyOwnClass) ssssI).language();
		MyOwnClass sssC = new Subclass();
		((Subclass) sssC).gender();
		
		sssC.Age();
		
		

	}

}
