package callByValue;

public class CallByValueChangingOrginaldata {
	int data=50;  
	  
	 void change(CallByValueChangingOrginaldata op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallByValueChangingOrginaldata op=new CallByValueChangingOrginaldata();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);
	   System.out.println("Your first argument is: "+args[0]);
	  //System.out.println(data);
	  
	 }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CallByValueChangingOrginaldata other = (CallByValueChangingOrginaldata) obj;
		if (data != other.data)
			return false;
		return true;
	}  
}
