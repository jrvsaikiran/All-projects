package trail;

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

public class Sampla {
public static void main(String[] args) {
	
	System.out.println("list of linkedlist");
	List<String> list1 = new LinkedList<>();
	list1.add("sai");
	list1.add("kiran");
	list1.add("jakkula");
	list1.add("raja");
	list1.add("sai");
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	
	System.out.println("list of arraylist");
	List<String> list11 = new ArrayList<>();
	list11.add("sai");
	list11.add("kiran");
	list11.add("jakkula");
	list11.add("raja");
	list11.add("sai");
	System.out.println(list11);
	
	System.out.println("set of hashset");
	Set<String> set1 = new HashSet<>();
	set1.add("sai");
	set1.add("kiran");
	set1.add("jakkula");
	set1.add("raja");
	set1.add("sai");
	set1.add(null);
	set1.add(null);
	System.out.println(set1);
	
	System.out.println("set of treeset ");
	Set<String> set2 = new TreeSet<>();
	set2.add("sai");
	set2.add("kiran");
	set2.add("jakkula");
	set2.add("raja");
	set2.add("sai");
	System.out.println(set2);
	
	System.out.println("map of hashmap");
	Map<String, String> map1 = new HashMap<String, String>();
	map1.put("sai", "blue");
	map1.put("kiran", "black");
	map1.put("jakkula", "pink");
	map1.put("jakkula", "yellow");
	map1.put("venkata", "yellow");
	map1.put("raja", "red");
	System.out.println(map1);
	
	System.out.println("map of treemap");
	Map<String, String> map2 = new TreeMap<>();
	map2.put("sai", "blue");
	map2.put("kiran", "black");
	map2.put("jakkula", "pink");
	map2.put("jakkula", "yellow");
	map2.put("venkata", "yellow");
	map2.put("raja", "red");
	System.out.println(map2);
	
	
	
	
}
}