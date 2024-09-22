package collection;

import java.util.HashMap;
import java.util.Map;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map=new HashMap();
		
		map.put("name","jerry");
		map.put("rollNo",101);
		map.put("div",'a');
		map.put("mathMarks",98);
		map.put("EnglishMarks",99);
		map.put("ur1","www.google.com");
		
		System.out.println(map);
		
		System.out.println(map.get("name"));
		
		System.out.println(map.get("div"));
		System.out.println(map.get("EnglishMarks"));
		System.out.println(map.get("url"));
		
		
		

	}

}
