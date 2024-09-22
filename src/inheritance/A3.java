package inheritance;

class A1{
	public void start1() {
		System.out.println("good");
	}
}
class A2 extends A1{
	public void star2() {
		System.out.println("happy");
	}
}
 class A3 extends A2 {
	public void star3() {
		System.out.println("very happy");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A3 obj=new A3();
		
		obj.start1();
		obj.star2();
		obj.star3();
		
		

	}

}
