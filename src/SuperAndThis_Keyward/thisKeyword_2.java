package SuperAndThis_Keyward;

class v{
	
	int i=10;
	
}

public class thisKeyword_2 extends v{
	
	int i=20;
	
	public void main(int i) {
		
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeyword_2 obj=new thisKeyword_2();
		
		obj.main(30);

	}

}
