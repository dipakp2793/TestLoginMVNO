package polymorphism;

public class practice {
	
	public void m1(String s) {
		System.out.println(s);
	}
	public void m1(int i,String s) {
		System.out.println(i+""+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice ref=new practice();
		ref.m1("good");
		ref.m1(10,"good");
		
		

	}

}
