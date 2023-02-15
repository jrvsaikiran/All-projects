package weeksix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A2 {

	public static void main(String[] args) {
		
		
		String str = "programming";
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<>();
		for (int i=0 ; i<str.length(); i--) {
			set.add(str.charAt(i));
			
		}
		for(Character c : set) {
			sb.append(c);
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str1 = sc.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char [] charArray = str1.toCharArray();
		for(char ch:charArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey());
			}
		}
	}
	

}

/*
2. Write a java program to remove duplicate characters 
in the given string.

i/p: google
o/p: g,o,l,e
*/