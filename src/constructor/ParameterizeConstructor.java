package constructor;

public class ParameterizeConstructor {
	
	String Lang;
	
	public  ParameterizeConstructor (String Lang) {
		
		System.out.println(Lang   +" Parameterize constructor");
		Lang="Langauge";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ParameterizeConstructor r1=new  ParameterizeConstructor("one");
		 ParameterizeConstructor r2=new  ParameterizeConstructor ("two");
		 ParameterizeConstructor r3=new  ParameterizeConstructor ("tree");
		 ParameterizeConstructor r4=new  ParameterizeConstructor ("four");
		 
		

	}

}
