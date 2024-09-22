package polymorphism;

public class a1 {
	
	public void login(String email,String pass) {
		System.out.println("nevigate to home page");
		
	}
    public void login(int mobno,String pass) {
    	
    	System.out.println("nevigate to  page");
    	
    }
	public static void main(String[] args) {
		
		a1 a=new a1();
		
		a.login("a@123.com","@123"); 
		a.login(123,"@123");
		

	}

}
