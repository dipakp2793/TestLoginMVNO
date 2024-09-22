package star;

public class Demo {
	public static void main(String[] args) {
		String a="sagar";
		String b="rajput";
		
		System.out.println("before swapping :"+ a +" "+ b );
		// append a+b
        a=a+b;   //sagarrajput
        
        a=a.substring(0, a.length()-b.length()); //rajput
        
        b=a.substring(b.length());   //sagar
        
        System.out.println("after swapping :"+ a +" "+ b );
	
	}

}
