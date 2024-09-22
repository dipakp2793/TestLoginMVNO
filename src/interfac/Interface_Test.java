package interfac;

interface A{
	void good();
}
interface B{
	void Bad();
}

public class Interface_Test implements A,B {
	public void good() {
		System.out.println("good");
	}
	public void Bad() {
		System.out.println("bad");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_Test ref=new Interface_Test();
		
		ref.good();
		ref.Bad();
		

	}

}
