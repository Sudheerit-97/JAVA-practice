package abstarctPractice;

public class Login extends Page {
     
	
	public Login(){
		System.out.println("LP_constrcutor");
		}
	@Override
	public void tittle() {
		System.out.println("login page tittle");
		
	}

	@Override
	public void url() {
		System.out.println("lp --url");
		
	}
	
	@Override
	public void pageloadingTime() {
		System.out.println("login page  loading time ___5 seconds ");
	}
	public void logindata(String Un, String pwd ) {
		System.out.println("enter user and password");
	}
}
