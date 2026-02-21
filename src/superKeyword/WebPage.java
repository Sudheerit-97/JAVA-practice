package superKeyword;

public class WebPage {
    public int speed=10; 
    
   public WebPage() {
    	System.out.println("webpage__default constructer");
    }
     
    public WebPage(int i) {
    	System.out.println("webpage__constructer" +i);
    }
    public void Calculatetime () {
    	System.out.println("webpage__50 second");
    }
	
    public final void  logo() {
    	System.out.println("webpage ___logo");
    }
	
}
