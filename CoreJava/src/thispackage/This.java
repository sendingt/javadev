package thispackage;

public class This {

	void m() {
		System.out.println("hello m");
		
	}
	void n(){  
		System.out.println("hello n");  
		//m();//same as this.m()  
		this.m();  
		} 
}
