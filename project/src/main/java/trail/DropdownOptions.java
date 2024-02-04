package trail;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DropdownOptions{
   public static void main(String[] args)  {
	   
	
	   List<String> list = new ArrayList<>();
	   list.add("bajji");
	   list.add("sai");
	   list.add("bajji");
	   list.add("venu");
	   list.add("kiran");
	   list.add("sap");
	   
	  // System.out.println(list);
	   
	   
	   List<String> list2 = new LinkedList<>();
		
		list2.add("Surekha");
		list2.add("Venu");
		list2.add("Niharika");
		list2.add("Aravindh");
		list2.add("Sai");
		list2.add("Niharika");
		list2.add("Vaishanvi");
			
		//System.out.println(list2);
	   
	   
	   Set<String> set = new HashSet<>();
	   set.add("sai");
	   set.add(null);
	   set.add("balaji");
	   set.add("murali");
	   set.add(null);
	   set.add("bopal");
	   set.add("sai");
	   //System.out.println(set);
	   
	   
	   Set<String> set1 = new TreeSet<>();
	   set1.add("sai");
	   set1.add("jrv");
	   set1.add("balaji");
	   set1.add("murali");
	   //set1.add(null);
	   //set1.add(null);
	   set1.add("sai");
	   //System.out.println(set1);
	   
	 
	   
	   Map<String, Integer> map = new HashMap<>();
	   map.put("sai", 29);
	   map.put("venu", null);
	   map.put("murali", 25);
	   map.put("list", null);
	   map.put(null, 35);
	   map.put("sai", null);
	  // System.out.println(map);
	   
	   
	   
	   Map<String, Integer> map1 = new TreeMap<>();
	   map1.put("sai", 29);
	   map1.put("venu", null);
	   map1.put("murali", 25);
	   map1.put("list", null);
	   map1.put("dd", 35);
	   map1.put("sai", null);
	  // System.out.println(map1);
	   
	   Map<String, Integer> map11 = new LinkedHashMap<>();
	   map11.put(null, 29);
	   map11.put("venu", null);
	   map11.put("murali", 25);
	   map11.put(null, null);
	   map11.put("abs", 35);
	   map11.put("sai", null);
	   //System.out.println(map11);
	   
	   
	 String str = "google";
	 
	   char[]  c =str.toCharArray();
	   
	 // Arrays.sort(strToChar);
	  
	//  System.out.print(strToChar );
	   
	   Map<Character, Integer> map3 = new HashMap<>();
	   
	  // map3.put(c, 1);
	   
	  // System.out.println(map3);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /* String input = "google";
	  
	 Map<Character, Long>  result = input.chars().mapToObj(c -> (char) c)
			 .collect(Collectors.groupingBy(c->c, Collectors.counting()));
	  
	  result.forEach ((k,v) -> { 
		 if (v>=1) {
			 System.out.println(k+":" +v);
		 }
	  });
      
	  */
	  
	  
	 
   }
}




		
	