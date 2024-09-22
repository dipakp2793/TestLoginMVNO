package Practice_Logical_Program;

public class Fiboncci_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<=19;i++) {
			
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
		}
			

	}

}
