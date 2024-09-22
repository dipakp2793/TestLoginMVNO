package Practice_Logical_Program;

public class Dublicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []num = {60,25,150,15,70,10,19,120,51,150,75,100,25};
		
		for(int i=0;i<=num.length-1;i++) {
			for(int j=i+1;j<=num.length-1;j++) {
			
			if  (num[i] == num[j]) {
				System.out.println("Duplicate number is: "+num[i]);
			}
			
		}

	}

}
}