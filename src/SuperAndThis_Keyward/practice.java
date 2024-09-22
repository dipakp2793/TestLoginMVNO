package SuperAndThis_Keyward;

class a{
	
	int i=10;
	
}

public class practice extends a {
	
	int i=20;
	public void show (int i) {
		System.out.println(super.i);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice obj=new practice();
		obj.show(30);

	}

}
