package abstraction;

abstract class movie{
	abstract void methodA();
}

public class film extends movie {
	void methodA() {
		System.out.println("bank atm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		movie obj=new film();
		
		obj.methodA();
		

	}

}
