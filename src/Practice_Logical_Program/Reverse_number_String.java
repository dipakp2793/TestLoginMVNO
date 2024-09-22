package Practice_Logical_Program;

public class Reverse_number_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="123456";
		String rev="";
		
		int len=str.length();
		System.out.println(len);
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
 