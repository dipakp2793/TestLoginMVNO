package polymorphism;//method overriding by using change number of parameter


public class Student {
	public void party(int a,String s) {
		System.out.println(a+" "+s);
	}
	public void friends(String s,int a) {
		System.out.println(s+" "+a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();
		
		obj.party(10,"dipu");
		obj.friends("be happy",10);

	}

}
