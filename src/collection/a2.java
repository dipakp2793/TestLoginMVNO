package collection;

import java.util.HashSet;
import java.util.Set;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(50);
		set.add(30);
		
		System.out.println(set);
		
		set.remove(30);
		
		System.out.println(set);
		
		System.out.println(set.contains(50));//boolean true
		
		System.out.println(set.isEmpty());//false
		set.clear();
		
		System.out.println(set.isEmpty());//true
		
		
		
		
		
		

	}

}
