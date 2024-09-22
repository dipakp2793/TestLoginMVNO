package inheritance;

class P{
	public void c1() {
		System.out.println("inheritace is the acquier property");
	}
}
class P1 extends P{
	public void c2(){
	System.out.println("collect property from other class");	
	}
}
class P2 extends P1{
	public void c3() {
		System.out.println("parrant class deliver propery to other class");
	}
}
class P3 extends P2{
	public void c4() {
	System.out.println("the class in that property is transfer is called child class");
	
	}
}


public class practiceinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P3 r1=new P3();
      
      r1.c1();
      r1.c2();
      r1.c3();
      r1.c4();
       
      
       
	}

}
