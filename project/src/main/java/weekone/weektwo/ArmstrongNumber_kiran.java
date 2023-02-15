package weektwo;

import java.util.Scanner;

public class ArmstrongNumber_kiran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			
			int num=i, rem=0, temp=0;
			while(num>0)
			{
				rem=num%10;
				temp=rem*rem*rem+temp;
				num=num/10;
			}
			if(temp==i)
			{
				System.out.println(i+" is Armstrong number");
			}
		
		}*/
	
	
	int i=1,a,arm,n;
	System.out.println("Armstrong numbers between 1 to 500 are");
	while(i<500)
	{
	n=i;
	arm=0;
	while(n>0)
	{
		a=n%10;
		arm=arm+(a*a*a);
		n=n/10;
	}
	if(arm==i)
		System.out.println(i);
	i++;
	}
		
	
}
}
	
	
	
	
	
	

