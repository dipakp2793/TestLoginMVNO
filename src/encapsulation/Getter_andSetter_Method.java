package encapsulation;

public class Getter_andSetter_Method {
	
	private String emp;
	private String Id;
	private String pan;
	
	public String getemp() {
		return emp;
	}
	public String getId() {
		return Id;
		
	}
	public String getpan() {
		return pan;
	}
	public void setemp(String value) {
		emp=value;
	}
	public void setId(String value) {
		Id=value;
	}
	public void setpan(String value) {
		pan=value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Getter_andSetter_Method obj=new Getter_andSetter_Method();
		obj.setemp("Dipak");
		obj.setId("DKMP");
		obj.setpan("Dk01");
		
		System.out.println(obj.getemp());
		System.out.println(obj.getId());
		System.out.println(obj.getpan());
		
		
		
		

	}

}
