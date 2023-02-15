package weeksix;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		 
	 	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first word");
		
		String s1 = sc.nextLine();
		
		System.out.println("Enter second word");
		
		String s2 = sc.next();
		
		//sc.close();
        
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
        	      
            if (i < s1.length())
                
            	result.append(s1.charAt(i));
 
            if (i < s2.length())
                
            	result.append(s2.charAt(i));
          
        }
        
        
        System.out.println("manipulate the given string is " +result);
	}

}

/*6. Write a java program to manipulate the given string

i/p1: abc	i/P1: abcdef	i/p1: abc
i/p2: xyz	i/p2: xyz	i/p2: xyzlmn

o/p: axbycz	o/p: axbyczdef	o/p:axbyczlmn*/