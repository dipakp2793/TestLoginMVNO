package polymorphism;

class A{
	public void good() {
		System.out.println();
	}
}



public class Practice2 extends A{
	public void good() {
		System.out.println(10);
		System.out.println(20);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ref=new Practice2();
		ref.good();
	
		
		
		
		
			
			
			
		}
		
	
		
		

	}


