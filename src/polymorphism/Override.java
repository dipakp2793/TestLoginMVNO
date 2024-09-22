package polymorphism;

class over{
	public void print() {
		System.out.println("in these method showing the detail of parent class ");
	}
}

public class Override extends over {
	public void print() {
		System.out.println("in these method showing the details of child class");
		System.out.println("we are ovrriding the method");
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		over obje=new Override();
		obje.print();

	}

}
