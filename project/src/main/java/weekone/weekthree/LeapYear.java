package weekthree;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					n=1;
				}
				else
				{
					n=0;
				}
			}
			else
			{
				n=1;
			}
			
		}
		else
		{
			n=0;	
		}
		
		if(n==1)
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" is Not Leap year");
		}
		
		
	}

}
