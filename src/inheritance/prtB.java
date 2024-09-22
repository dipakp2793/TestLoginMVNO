package inheritance;

 class classA{
	public void good() {
		System.out.println("good");
	}
}
 class classB extends classA{
	 public void goood() {
		 System.out.println("very very good");
	 }
 }
 


 

public class prtB extends classB {
	public void vgood() {
		System.out.println("VERY GOOD");
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prtB ref=new prtB();
		
		ref.good();
		ref.vgood();
		ref.goood();
		
		
		
		
	
		
		

	}

}
