package polymorphism;

public class b1 {
	
	public void login(String email,String pass) {
		System.out.println("Next page should be open");
	}
	
	public void login(int mobno,String pass) {
		System.out.println("nevigate to next page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b1 s1=new b1();
		
		s1.login("abc@123.com","@123");
		s1.login(123, "@123");

	}

}
