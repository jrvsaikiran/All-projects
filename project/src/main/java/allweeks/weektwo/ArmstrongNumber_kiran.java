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
	
	
	int i=153,rem,arm,n;
	System.out.println("Armstrong numbers between 1 to 500 are");
//	while(i<154)
	for(i=1;i<=500;i++)
	{
	n=i;
//	System.out.println("n value= "+n);
	arm=0;
	while(n>0)
	{
		rem=n%10;
//		System.out.println("rem= "+rem);
		arm=arm+(rem*rem*rem);
//		System.out.println("arm= "+arm);
		n=n/10;
//		System.out.println("n= "+n);
	}
	if(arm==i)
	System.out.println("i yes= "+i);
//	i++;
	}
		
	
}
}
	
	
	
	
	
	

