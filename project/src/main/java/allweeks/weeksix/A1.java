package weeksix;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
//		String str = sc.next();
		String str = "google";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char [] charArray = str.toCharArray();
		System.out.println(charArray);
		for(char ch:charArray)
		{
			if(map.containsKey(ch))
			{
//				System.out.println(ch+" ch");
//				System.out.println(map+" map1");
				map.put(ch, map.get(ch)+1);
//				System.out.println(map+" map2");
			}
			else
			{
//				System.out.println(map+" map3");
				map.put(ch, 1);
//				System.out.println(map+" map4");
			}
			
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}

		
	}
}
/*1. Write a java program to find duplicate characters in the given string.

i/p: google
o/p: o,g

*/