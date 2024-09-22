package LogicalProgramNotes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=13;
		int a=0;
		
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				a=a+1;
			}
		}
		if(a==0) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
		
		

	}

}
