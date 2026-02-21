package abstarctPractice;

public class loginTest {

	public static void main(String[] args) {
		Login ln = new Login();
		ln.tittle();
		ln.url();
		ln.pageloadingTime();
       ln.logindata("sudheer", "sudheer");
        Login.display();
        ln.footers();
        
       System.out.println("____________"); 
        Page pg =  new Login();
        pg.tittle();
        pg.url();
        pg.pageloadingTime();
        Page.display();
        pg.footers();
        
        
       
        
       
	}

}
