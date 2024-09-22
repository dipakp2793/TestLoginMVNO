package encapsulation;

public class capsul {
	
	private int rollno;
	private String name;
	private String classname;
	
	
	public int getrollno() {
		return rollno;
		
	}
	public String getname() {
		return name;
		
	}
	public String getclassname() {
		return classname;
		
	}
	public void setrollno(int value) {
		rollno=value;
	}
	public void setname(String value) {
		name=value;
	}
	public void setclassname(String value) {
		classname=value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		capsul obj=new capsul();
		
		obj.setrollno(10);
		obj.setname("dipak");
		obj.setclassname("bugspotter");
		
		System.out.println("mca");
		System.out.println("student roll no "+obj.getrollno());
		//System.out.println("student name "+getname());
		System.out.println("student class "+obj.getclassname());
		
		

	}

}
