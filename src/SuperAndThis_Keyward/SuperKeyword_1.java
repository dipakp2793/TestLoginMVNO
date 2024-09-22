package SuperAndThis_Keyward;

class z{
	int b=5;
	
}

public class SuperKeyword_1 extends z {
	
	int b=10;
	
	public void main(int b) {
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyword_1 obj=new SuperKeyword_1();
		obj.main(30);

	}

}
