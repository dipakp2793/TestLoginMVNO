package polymorphism;

// add(int,int)
//add(int,float)

public class methodOverlodingDataType {
	public void show(String s ) {
		System.out.println("be in present");
	}
	public void show(int i) {
		System.out.println(i+" "+"good");
		
	}
	
	

	public static void main(String[] args) {
		
		methodOverlodingDataType x1=new  methodOverlodingDataType();
		 
		 x1.show(10);
		 x1.show(15);

	}

}
