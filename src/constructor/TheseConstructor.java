package constructor;

public class TheseConstructor {
	
	int x;
	
	public TheseConstructor(int x) {
		
		this.x=x;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheseConstructor myobj=new TheseConstructor(5);
		System.out.println("value of x="+myobj.x);
		
		
		

	}

}
