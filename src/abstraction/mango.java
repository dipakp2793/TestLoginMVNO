package abstraction;

abstract class fruit{
	
	abstract void taste();
	
	public void m1() {
		System.out.println("hi");
	}
	
	
}
class apple extends fruit{
	void taste() {
		
		System.out.println("taste is sweet");
	}
}

public class mango extends apple {
	void taste() {
		System.out.println("taste is sour");
	}

	public static void main(String[] args) {
		
		fruit mango = new mango();
		fruit apple= new apple();
		
		mango.taste();
		mango.m1();
		
		
		apple.taste();
		mango.m1();
		
		
		

	}

}
