package weeksix;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String str = sc.nextLine();
		
		char String[] = str.toCharArray();
		
		for(int i=1;i<str.length();i=i+2)
		{
			System.out.print(String[i]+",");
		}
	}

}

/*8. Write a java program to print the chacters in odd places.
1	2	3	4	5	6
i/p: g	o	o	g	l	e
o/p: g,o,l*/