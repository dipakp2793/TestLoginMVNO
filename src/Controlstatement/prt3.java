package Controlstatement;

public class prt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		for(int i=0;i<5; i++) {
			
			for(int x=0;x<5-i;x++) {
				
				System.out.print(" ");
			}
			for(int y=0;y<=i;y++) {
				
				System.out.print("* ");
			}
				System.out.println();	
		}
			
	}

}
