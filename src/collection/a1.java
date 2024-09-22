package collection;

import java.awt.List;
import java.util.ArrayList;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add("tom");
		
		System.out.println(list);
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.clear();
		System.out.println(list);
		
		int a= list.size();
		System.out.println(a); 
		
		
		
		
		 

	}

}
