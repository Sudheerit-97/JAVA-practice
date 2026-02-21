package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMMap {

	public static void main(String[] args) {
    HashMap <String, String> empdata =new HashMap <String, String>(); 
    empdata.put("roni", "sdet1"); 
    empdata.put("riya", "sdet2"); 
    empdata.put("pankaj", "sdet3"); 
    empdata.put("avinesh", "sdet4"); 
    empdata.put("ankit", "sdet4"); 
    empdata.put(null, "sdet4");
    //empdata.put(null, null);
    
    System.out.println(empdata.get("sdet1"));
    System.out.println(empdata);
    
  for(Map.Entry<String,String> entry: empdata.entrySet()){
	 System.out.println(entry.getKey() + "::" + entry.getValue());
  }
 
	}

}
