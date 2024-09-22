package abstraction;

abstract class Vehical {
	
	abstract void start();
}
class Car extends Vehical{
	void start() {
		System.out.println("car start with key");
	}
}
class Schooter extends Vehical{
	void start() {
		System.out.println("schooter is start with kick");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vehical obj=new Car();
		
		obj.start();
		
		
		
		
		
		
		
	}
	
}

