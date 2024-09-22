package abstraction;


abstract class name {
	abstract void main();
	
}

public class abc extends name {
	void main(){
		System.out.println("safely main");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name ref=new abc();
		ref.main();
		

	}

}
