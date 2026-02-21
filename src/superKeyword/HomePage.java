package superKeyword;

public class HomePage extends WebPage {
	
	public int speed= 20; 
	 public HomePage() {
		  super(10);
	    	System.out.println("HomePage__default constructer");
	    }
	     
	    public HomePage(int i) {
	        super(20);
	    	System.out.println("Homepage__constructer" +i);
	    }
	
	@Override
	  public void Calculatetime () {
		super.Calculatetime();
	   System.out.println("Homepage__20 second");
	   super.logo();
	   System.out.println(speed );
	   System.out.println(super.speed);
	    }
}
