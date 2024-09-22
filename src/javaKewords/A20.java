package javaKewords;

class A19{
	public void m1(String b) {
		
		System.out.println("m1");
	}
}

public class A20 extends A19 {
	public void m2() {
		super.m1("hellow");
		System.out.println("m2");
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A20 s1=new A20();
		
		s1.m2();
		

	}

}
