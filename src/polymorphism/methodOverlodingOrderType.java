package polymorphism;

public class methodOverlodingOrderType {
	
	
	public void show(String s,int i){
		System.out.println(s+" "+i);
	}
	public void show(int i,String s) {
		System.out.println(i+""+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverlodingOrderType s1=new methodOverlodingOrderType();
		
		s1.show("be in present",10);
		s1.show(15,"be in present");
		
		

	}

}
