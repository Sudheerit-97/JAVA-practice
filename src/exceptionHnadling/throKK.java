package exceptionHnadling;

public class throKK {

	public static void main(String[] args) {
       String data = null; 
       
       try {
       if (data == null) {
    	throw new Exception(" ExceptionISComing"); 
    	   
       } 
       
       
      
       } 
       catch (Exception e ) {
    System.out.println(" data is not present" + e.getMessage());
    e.printStackTrace();
	}

	}
}
