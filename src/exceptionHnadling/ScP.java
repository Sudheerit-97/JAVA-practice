package exceptionHnadling;

public class ScP {

	public static void main(String[] args) {
		
		String s = "hello"; 
		String S= s.concat("selenium"); 
		
	  System.out.println(S);
	  
	  
	  String s1 = "hello"; 
	  String s2 = "hello"; 
	  
	  String s3 = new String("world"); 
	  
	  String s4 = "world"; 
	  String s5 = "hello"; 
	  String s6 = new String ("selenium"); 
	  String s7 = "selenium"; 
	  String s8 = "selenium"; 
	  
	  System.out.println(s1==s2);
	  System.out.println(s3==s4);
	  System.out.println(s7==s8);
	  System.out.println(s3.equals(s4));
	  
	  String tr = "hello"; 
	tr.concat("selenium"); 
	tr.concat("testing"); 
	System.out.println(tr);
		
	  
	  
       
	}

}
