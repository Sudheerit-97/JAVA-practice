package exceptionHnadling;

public class TryCatchblock {
     String name;
	public static void main(String[] args) {
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
        
        try {
        	TryCatchblock obj = new TryCatchblock();
        	obj= null;
        	obj.name= "sudheer";
        	 
        int i = 9/0;
        } 
        catch(ArithmeticException e) {
          
        	System.out.println("Exception is coming");
        	e.printStackTrace();
        }
        catch(NullPointerException st) {
            
        	System.out.println("Exception is coming");
        	st.printStackTrace();
        }
        
        System.out.println("bye");
	}

}
