package polymorphism;

public class a5pra {
	public void login(String email,String pass) {
		System.out.println("Should be nevigate on next page");
	}
	public void login(int mobno,String pass) {
		System.out.println("Should be nevigate on next page");
	}

	public static void main(String[] args) {
		
		a5pra r1=new a5pra();
		
		r1.login("eml@123.com","@123");
		r1.login("123", "123");
		
				

	}

}
