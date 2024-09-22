package abstraction;

abstract class Abstraction_prt1{
	abstract void gas();
	
}


 class Abstraction_prt extends Abstraction_prt1 {
	 void gas() {
		 System.out.println("good");
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstraction_prt1 obj=new Abstraction_prt();
		
		obj.gas();

	}

}
