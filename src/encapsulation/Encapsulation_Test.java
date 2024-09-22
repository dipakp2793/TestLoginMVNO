package encapsulation;

public class Encapsulation_Test {
	
	private int Rollno;
	private String classname;
	private String division;
	
	
	public int getRollno() {
		return Rollno;
	}
	public String getclassname() {
		return classname;
	}
	public String getdivision() {
		return division;
		
	}
	public void setRollno(int value) {
		Rollno=value;
		
	}
	public void setclassname(String value) {
		classname=value;
	}
	public void setdividion(String value) {
		division=value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_Test ref=new Encapsulation_Test();
        ref.setRollno(1);
		ref.setclassname("RCPIT");
		ref.setdividion("A");
		
		
		System.out.println(ref.getRollno());
		System.out.println(ref.getclassname());
		System.out.println(ref.getdivision());
		
		

	}

}
