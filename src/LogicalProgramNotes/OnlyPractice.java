package LogicalProgramNotes;

import java.util.Scanner;

public class OnlyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a=0;
		int b=0;
		int c=1;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("print the number");
		
		num=sc.nextInt();
		System.out.println("number series");
		
		for (int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a  +"");
			
		}
		
		
		

	}

}
