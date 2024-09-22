package ExeptionHandling;

import java.rmi.AccessException;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
        finally {
        	System.out.println("cleanup code");
        }
	}

}
