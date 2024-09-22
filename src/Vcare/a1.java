package Vcare;

public class a1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String s="This is good";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)== 'T') {
				
				count++;
				
			}else {
				System.out.println("not match");
			}
		}
		System.out.println(count);
				
	}
	}


