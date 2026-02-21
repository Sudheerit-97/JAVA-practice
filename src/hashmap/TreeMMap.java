package hashmap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMMap {

	public static void main(String[] args) {
	 TreeMap <String, String> empdata =new TreeMap <String, String>(Collections.reverseOrder()); 
	    empdata.put("Roni", "sdet1"); 
	    empdata.put("riya", "sdet2"); 
	    empdata.put("Pankaj", "sdet3"); 
	    empdata.put("Avinesh", "sdet4"); 
	    empdata.put("ankit", "sdet4"); 
	    empdata.put("roni", "sdet1"); 
	    empdata.put("Ankit", "sdet4");  
	    //empdata.put(null, "sdet4");
	    //empdata.put("sudheer", null);
	    // null key entry is not alloowed in tree map
	    empdata.put("selenium", null);  
	    
	    System.out.println(empdata); 
	    
	    System.out.println("________________");
	    
	     for(Map.Entry<String, String> entry: empdata.entrySet()){
	    	System.out.println(entry.getKey() +"::"+entry.getValue());
	    }


	}

}
