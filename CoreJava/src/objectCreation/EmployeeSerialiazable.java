package objectCreation;

public class EmployeeSerialiazable implements java.io.Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6398866390438385638L;
	public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	   public static void main(String[] args) {
		EmployeeSerialiazable e = new EmployeeSerialiazable();
		e.mailCheck();
	}

}
