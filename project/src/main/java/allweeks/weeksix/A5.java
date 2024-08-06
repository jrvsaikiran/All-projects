package weeksix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		
		String str1 = "sai";
		String str2 = "ias";
		//System.out.println("given strings are "+check(str1,str2));
		
		if(check(str1, str2)==true) {
			System.out.println("given strings are anagram");
		}
		else if (check(str1, str2)==false) {
			System.out.println("given strings are not anagram");
		}
		
	}
	
	public static boolean check(String str1,String str2) {
		char[] str1char1 =  str1.toCharArray();
		char[] str2char2 = str2.toCharArray();
		
		Arrays.sort(str1char1);
		Arrays.sort(str2char2);
		
		return Arrays.equals(str1char1, str2char2);
	}
}
		
		
		
		
		
		
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First word");
		String str1 = sc.next();
		System.out.println("Enter Second word");
		String str2=sc.next();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		boolean status = true;
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		if(str1.length()==str2.length())
		{
			for(char ch:c1)
			{
				if(map1.containsKey(ch))
				{
					map1.put(ch, map1.get(ch)+1);
				}
				else
				{
					map1.put(ch, 1);
				}
			}
		}
		for(char ch:c2)
		{
			if(map2.containsKey(ch))
			{
				map2.put(ch, map2.get(ch)+1);
			}
			else
			{
				map2.put(ch, 1);
			}
		}
		for(char ch:c1)
		{
			if(map1.get(ch)!=map2.get(ch))
			{
				status=false;
				break;
			}
		}
		if(status)
		{
			System.out.println(status);
		}
		else
		{
			System.out.println(status);
		}
	}

}*/

/*5. Write a java program to find whether the given strings are anagram or not.

i/p1: sabha
i/p2: basha
o/p: true/false
*/
