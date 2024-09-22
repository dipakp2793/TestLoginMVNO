package interfac;

interface inter1{
	
	default void m1() {
		System.out.println("m1");
	}
}
interface inter2{
	default void m2() {
		System.out.println("m2");
		
	}
}

public class int1 implements inter1,inter2{
	
	 void m3(){
		 System.out.println("m3");
		 
	 }

	public static void main(String[] args) {
		
		inter2 a= new int1();
		
		
		a.m2();
	
		
	
		
		
		
		

	}

}
