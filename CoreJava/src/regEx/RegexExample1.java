package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String args[]) {
		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		System.out.println(p);
		Matcher m = p.matcher("as");
		System.out.println(m);
		boolean b = m.matches();
		System.out.println(b);

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);
	}

}
