package inputOutput;

import java.io.IOException;

public class ThreeStreamClass {

	public static void main(String[] args) {
		
		System.err.println("Hey Dude its error");
		//System.err.println("Hey Dude its out");
		System.out.println("Hey Dude its out");
		try {
			int i = System.in.read();
			//String s = Integer.parseUnsignedInt(i);
			System.out.println("Hey dude you created me "+i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
