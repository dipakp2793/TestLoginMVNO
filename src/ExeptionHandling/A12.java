package ExeptionHandling;

public class A12 {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			int c;
			
			c=a/b;
			
			System.out.println(c);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("cleanup code");
		}
		
		System.out.println("hello");

	}

}
