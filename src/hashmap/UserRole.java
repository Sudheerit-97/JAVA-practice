package hashmap;

import java.util.HashMap;

public class UserRole{

	public void dologin(String un, String pw) {
		System.out.println(un+"- "+pw);
	}
	

	public String getusercreds(String role) {
		HashMap<String, String> usermap = new HashMap<String, String>(); 
		usermap.put("admin", "admin:admin@123"); 
		usermap.put("partner", "partner:partner@123"); 
		usermap.put("vendor", "vendor:vendor@123");
		usermap.put("user", "user:user@124"); 
		usermap.put("user", "naveen:user@124");
		
		return usermap.get(role);
	}
	public static void main(String[] args) {
		String role=  "user"; 
		UserRole us = new UserRole();
		String creds = us.getusercreds(role); 
		System.out.println(creds);
		
		String cred []= creds.split(":"); 
		String un = cred[0].trim(); 
		String pw = cred[1].trim(); 
		
		us.dologin(un, pw);
			
			
		
		
		
		
			
		
		
	}

}
