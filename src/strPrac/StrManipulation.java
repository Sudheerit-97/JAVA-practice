package strPrac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrManipulation {

	public static void main(String[] args) {
      String str = "This is my java code and i am so happy i am expert";
      
      System.out.println(str.length());
      
     System.out.println(str.charAt(0));
     System.out.println(str.charAt(49));
     
     System.out.println(str.indexOf("T"));
     
     System.out.println(str.indexOf("i"));
     System.out.println(str.indexOf("i", str.indexOf("i")+1));
     System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));
     System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));
     
     String mesg = "this is my java code"; 
     System.out.println(mesg.indexOf("java"));
     System.out.println(mesg.indexOf("python"));
     
     String m = "welcome admin"; 
     if (m.indexOf("welcome")==0) {
    	 System.out.println("correct message");
     }
     
     else {
    	 System.out.println("string fail");
     }
		
     String test = "  Hello world     "; 
     System.out.println(test.trim());
     System.out.println(test.trim().replace(" ", "/"));
     
     String dob = "01-01-1997";
     
     System.out.println(dob.replace("-", "/"));
     
     String up = " Sudheer automation lab"; 
     System.out.println(up.toUpperCase().trim());
     System.out.println(up.toLowerCase());
     
     String order = " your id is 12345";
     String t= (order.replaceAll("\\D+", ""));
     System.out.println(t);
     
     
     String t1 = "user id is 9090 and order is 12345";
      
     //System.out.println(t1.replaceAll("\\D+", ""));
     Pattern pattern= Pattern.compile("\\d+");
     Matcher matcher = pattern.matcher(t1);
     
     String userid = null;
     String orderid = null;
     if (matcher.find()) {
    	 userid= matcher.group();
    	 System.out.println(userid);
     }
     if (matcher.find()) {
    	 orderid= matcher.group();
    	 System.out.println(orderid);
     }
     
	}
	
	
	}


