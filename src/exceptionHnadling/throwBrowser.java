package exceptionHnadling;

public class throwBrowser {

	public static void main(String[] args) {
   String browser = " ie " ; 
		   
		   if(browser.equals("chrome")) {
			   System.out.println(" launch chromebroweser");
		   }
		   else  if(browser.equals("firefox")) {
			   System.out.println(" launch chromebroweser");
		   }
		   else   if(browser.equals("safari")) {
			   System.out.println(" launch chromebroweser");
		   }
		   else {
			   System.out.println(" Pass the right browser");
			   throw new MyExcesption("INCORRECT BOWSER"); 
		   }
		  
	}

}
