package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHassh {

	public static void main(String[] args) {
		LinkedHashMap <String, String> empdata =new LinkedHashMap <String, String>(); 
	    empdata.put("roni", "sdet1"); 
	    empdata.put("riya", "sdet2"); 
	    empdata.put("pankaj", "sdet3"); 
	    empdata.put("avinesh", "sdet4"); 
	    empdata.put("ankit", "sdet4"); 
	    empdata.put(null, "sdet4");
	    empdata.put("sudheer", null);
	    
	    System.out.println(empdata);
	    
	    for(Map.Entry<String, String> entry: empdata.entrySet()){
	    	System.out.println(entry.getKey() +"::"+entry.getValue());
	    }

	}

}
