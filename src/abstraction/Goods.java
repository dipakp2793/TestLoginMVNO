package abstraction;
abstract class boll{
	abstract void sweet();
}
public class Goods extends boll {
	void sweet(){
		System.out.println("test is sweet");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boll obj=new Goods();
		
		obj.sweet();

	}

}
