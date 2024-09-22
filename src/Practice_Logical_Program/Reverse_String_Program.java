package Practice_Logical_Program;

public class Reverse_String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="These is java program";
		
		
		System.out.println("----rev String----");
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
