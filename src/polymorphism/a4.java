package polymorphism;

public class a4 {
	public void login(String email,String pass) {
		System.out.println(" should nevigate another page");
	}
	public void login(int no, String pass) {
		System.out.println("should nevigate another page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a4 r1 = new a4();
		
		r1.login("em@123.com", "@123");
		r1.login("no", "@123");

	}

}
