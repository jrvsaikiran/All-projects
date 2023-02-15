package weeksix;


import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ARAY LIST");
		List<String> list1 = new ArrayList<>();
		
		
		list1.add("Surekha");
		list1.add("Venu");
		list1.add("Niharika");
		list1.add("Aravindh");
		list1.add("Sai");
		list1.add("Niharika");
		list1.add("Vaishanvi");
			
			
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		
		System.out.println("LINKED LIST");
		List<String> list2 = new LinkedList<>();
		
		list2.add("Surekha");
		list2.add("Venu");
		list2.add("Niharika");
		list2.add("Aravindh");
		list2.add("Sai");
		list2.add("Niharika");
		list2.add("Vaishanvi");
			
		System.out.println(list2);
		
		System.out.println("HASH SET");
		Set<String> set1 = new HashSet<>();
		
		set1.add(null);
		set1.add("Venu");
		set1.add("Niharika");
		set1.add("Aravindh");
		set1.add("Sai");
		set1.add("Niharika");
		set1.add("Vaishanvi");
			
		System.out.println(set1);
		
		System.out.println("TREE SET");
		Set<String> set2 = new TreeSet<>();
		
		set2.add("Surekha");
		set2.add("Venu");
		set2.add("Niharika");
		set2.add("Aravindh");
		set2.add("Sai");
		set2.add("Niharika");
		set2.add("Vaishanvi");
			
		System.out.println(set2);
		
		System.out.println("HASH MAP");
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("Lavender", "Surekha");
		map1.put("Green", "Venu");
		map1.put("White", "Niharika");
		map1.put("Black", "Aravind");
		map1.put("Green", "Sai");
		map1.put("Red", "Vaishnavi");
		map1.put("Yellow", "Niharika");
		map1.put("Brown", "venu");
		
		System.out.println(map1);
		
		System.out.println("TREE MAP");
		Map<String, String> map2 = new TreeMap<>();
		
		map2.put("Lavender", "Surekha");
		map2.put("Green", "Venu");
		map2.put("White", "Niharika");
		map2.put("Black", "Aravind");
		map2.put("Green", "Sai");
		map2.put("Red", "Vaishnavi");
		map2.put("Yellow", "Niharika");
		map2.put("Brown", "venu");
		
		System.out.println(map2);
		
		
		
		
		
		System.out.println("__-------______----------_______----------______");
		//------------------------------------------------------------------------
		
		
		
		
		System.out.println("list of linkedlist");
		List<String> list11 = new LinkedList<>();
		list11.add("sai");
		list11.add("kiran");
		list11.add("jakkula");
		list11.add("raja");
		list11.add("sai");
		System.out.println(list11);
		Collections.sort(list11);
		System.out.println(list11);
		
		System.out.println("list of arraylist");
		List<String> list111 = new ArrayList<>();
		list111.add("sai");
		list111.add("kiran");
		list111.add("jakkula");
		list111.add("raja");
		list111.add("sai");
		System.out.println(list111);
		
		System.out.println("set of hashset");
		Set<String> set11 = new HashSet<>();
		set11.add("sai");
		set11.add("kiran");
		set11.add("jakkula");
		set11.add("raja");
		set11.add("sai");
		set11.add(null);
		set11.add(null);
		System.out.println(set11);
		
		System.out.println("set of treeset ");
		Set<String> set21 = new TreeSet<>();
		set21.add("sai");
		set21.add("kiran");
		set21.add("jakkula");
		set21.add("raja");
		set21.add("sai");
		System.out.println(set21);
		
		System.out.println("map of hashmap");
		Map<String, String> map11 = new HashMap<String, String>();
		map11.put("sai", "blue");
		map11.put("kiran", "black");
		map11.put("jakkula", "pink");
		map11.put("jakkula", "yellow");
		map11.put("venkata", "yellow");
		map11.put("raja", "red");
		System.out.println(map11);
		
		System.out.println("map of treemap");
		Map<String, String> map21 = new TreeMap<>();
		map21.put("sai", "blue");
		map21.put("kiran", "black");
		map21.put("jakkula", "pink");
		map21.put("jakkula", "yellow");
		map21.put("venkata", "yellow");
		map21.put("raja", "red");
		System.out.println(map21);
		
		
	}

}
