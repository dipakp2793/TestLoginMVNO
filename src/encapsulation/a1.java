package encapsulation;

public class a1 {
	
	private int rollno=101;
	
	public void setrollno(int rollno) {
		this.rollno=rollno;
		
	}
    public int getrollno() {
    	return rollno;
    	
    }
	
	
	public static void main(String[] args) {
		
		a1 a=new a1();
		a.setrollno(102);
		System.out.println(a.getrollno());
		
		
		
	}

}
