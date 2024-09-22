package abstraction;

abstract class play{
	abstract void run ();
	
}

class Practice extends play {
	void run() {
		System.out.println("Game is safe");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		play obj=new Practice();
		
		obj.run();
		
		

	}

}
