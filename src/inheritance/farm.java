package inheritance;

class garden{
	public void workers() {
		System.out.println("cutting the unwanted tree");
	}
}
class plot extends garden{
	public void employee() {
		System.out.println("working");
	}
}


public class farm extends plot {
	public void employer() {
		System.out.println("provid work");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		farm obj=new farm();
		
		obj.workers();
		obj.employee();
		obj.employer();
		

	}

}
