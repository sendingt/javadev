package stringExample;

public class TostringExample {
	 int rollno;  
	 String name;  
	 String city;  
	  
	 TostringExample(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	 
	  
	 @Override
	public String toString() {
		return "TostringExample [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}


	public static void main(String args[]){  
		 TostringExample s1=new TostringExample(101,"Raj","lucknow");  
		 TostringExample s2=new TostringExample(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1.toString());//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }

}
