package encapsulation;

public class Student {
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
		
		Student obj=new Student();
		
		obj.setrollno(1);
		obj.setname("dipak");
		obj.setclassname("highschool");
		
		
		System.out.println("Student Roll no: "+obj.getrollno());
		System.out.println("Student name: "+obj.getname());
		System.out.println("Student Class: "+obj.getclassname());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
