package polymorphism;

public class methodOverloadingExample {
	 
	 
	public void show(String s) {
		System.out.println(s);
		
	}
	public void show(int i,String s) {
		System.out.println(i+" " +s);
	}
	
	
	
	

	public static void main(String[] args) {
		
		methodOverloadingExample s1 = new methodOverloadingExample();
		
		s1.show("be in present");
		s1.show(10, "be in present");

	}

}
