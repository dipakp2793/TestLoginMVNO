package inheritance;

class cricket{
	public void batA() {
		System.out.println("MRF");
	}
	
}
class batB extends cricket {
      public void batB() {
    	  System.out.println("Hero honda");
		
		
	}
}


public class Inheritanceprac extends batB {
	public void Inheritanceprac() {
		
		System.out.println("DDH");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritanceprac obj= new Inheritanceprac();
		
		obj.batA();
		obj.batB();
		obj.Inheritanceprac();
		

	}

}
