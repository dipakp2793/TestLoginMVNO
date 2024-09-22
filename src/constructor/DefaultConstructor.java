package constructor;

public class DefaultConstructor {
	
	public String name;
	
	 DefaultConstructor() {
		System.out.println("Default constructor");
		name="coconut";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DefaultConstructor r1=new  DefaultConstructor();
		 
		 
		 System.out.println("tree"+" "+r1.name);

	}

}
