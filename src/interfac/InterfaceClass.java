package interfac;

interface Interlock_1{
	void day();
}
 interface Interlock_2{
	 
	 void night();
 }



public class InterfaceClass implements Interlock_1,Interlock_2 {
	
	public void day() {
		System.out.println("good");
	}
	public void night() {
		System.out.println("very very good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceClass obj=new InterfaceClass();
		
		obj.day();
		obj.night();
		

	}

}
