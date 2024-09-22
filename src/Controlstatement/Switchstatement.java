package Controlstatement;

public class Switchstatement {

	public static void main(String[] args) {
		int num=48;
		String size;
		
		
		switch (num) {
		
		case 29:
		size = "small";
		break;
		
		case 42:
			size = "Madium";
			break;
			
		case 44:
			size = "large";
			break;
			
		case 48:
			size = "Extra large";
			break;
			
		default:
			size = "unknown";
			break;
			
				
		}
		
		
		System.out.println("size: "+size);
	
		
	}

}
