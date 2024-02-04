package weekthree;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		//int year=sc.nextInt();
		for (int i=1900;i<=2024;i++) {
			
		
		if(i%4==0)
		{
			if(i%100==0)
			{
				if(i%400==0)
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
			System.out.println(i+" is Leap Year");
		}
		
		else
		{
			System.out.println(i+" is Not Leap year");
		}
		}
		
		
	}

}
