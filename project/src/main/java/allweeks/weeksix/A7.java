package weeksix;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter word");
		//String str = sc.next();
		String str = "google";
		char [] charArray = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: charArray)  //(g:google)
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
		
		System.out.println(map);
		
		
		for(Map.Entry<Character, Integer> entry :  map.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
				//break;
			}
		}
		
	}
		
}


/*7. Write a java program to print first repeated character in the given string

i/p: google
o/p: g*/




