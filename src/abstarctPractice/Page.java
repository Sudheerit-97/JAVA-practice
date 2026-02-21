package abstarctPractice;

public abstract class Page {

	public Page(){
		System.out.println("page___constructor");
	}
	public abstract void  tittle();
	public abstract void url();
	
	public void pageloadingTime() {
		System.out.println("page loading time ___20 seconds ");
	}
	public static void display() {
		System.out.println("display the sites ");
	}
	public void footers() {
		System.out.println("display the footers");
	}
	

}
