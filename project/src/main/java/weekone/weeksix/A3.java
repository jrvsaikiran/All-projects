package weeksix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class A3 {

	public static void main(String[] args) {
		
		
		 String input = "google";
		  
		 Map<Character, Long>  result = input.chars().mapToObj(c -> (char) c)
				 .collect(Collectors.groupingBy(c->c, Collectors.counting()));
		  
		  result.forEach ((k,v) -> { 
			 if (v>=1) {
				
				
			 }
			 System.out.println(k+"-" +v);
		  }); 
		
		
		  
		  
		 
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str = sc.next();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char [] charArray = str.toCharArray();
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
			
				System.out.println(entry.getKey()+":"+entry.getValue());
			

		}
		
		
		
	}

}


/*
3. Write a java program to print number of occurances
 of each character in the given string.

i/p: google
o/p: g-2,o-2,l-1,e-1*/



