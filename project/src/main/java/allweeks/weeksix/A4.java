package weeksix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
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
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}

		}
	}

}

/*4. Write a java program to print unqiue characters
in the given string.

i/p: google
o/p: l,e*/
