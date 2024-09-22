package Practice_Logical_Program;

public class Prime_Number_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=91;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				
			count++;
			}
			
			
		}
		System.out.println(count);
		
		if(count==2) {
			System.out.println("Number is Prime");
		}else
		{
			System.out.println("Number is not Prime");
		}

	}
	
	

}
