package practice;

public class ThisCons {
	
	String user; 
	String Password; 
	
	public ThisCons( String  user, String Password) {
		this.Password =Password; 
		this.user = user; 
		
	}
	 public void dologin () {
		 System.out.println("enter the usernam  ::" +user );
		 System.out.println("enter the Password :: "+ Password);
		 System.out.println("Click the eneter button");
		 System.out.println("user logged in ");
	 }
	

}
