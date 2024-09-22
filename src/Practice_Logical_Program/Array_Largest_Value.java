package Practice_Logical_Program;

import java.util.Arrays;

public class Array_Largest_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {25,15,10,19,51,75,100};
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length-1;i++) {
			System.out.println(num[i]);
			
			System.out.println("Largest number is: "+num[num.length-1]); 
		}
		
		

	}
}

