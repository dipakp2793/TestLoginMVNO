package string;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	    String str="ABCD";
	    String rev=null;
	    
	    int len=str.length();
	    
	    System.out.println(len);   // 4
	    
	    for(int i=len-1;i>=0;i--) {
	    	rev=rev+str.charAt(i);
	    	
	    }
	    
	    System.out.println("reverse string is:"+rev);
	

	}

}
