package weektwo;

import java.util.Scanner;

public class MulDivSubAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a values");
		int a=sc.nextInt();
		System.out.println("enter  b values");
		int b=sc.nextInt();
		

		if(a>0 && b>0)
		{
			
			int c=a/b;
			System.out.println("division of a & b=" +c);
			
		}
		else if(a<0 && b<0)
		{
			 int c=a+b;
				System.out.println("addition of a & b=" +c);
		}
		else if(a>0 && b<0)
		{
			int c=a-b;
			System.out.println("subtration of a &b=" +c);
		}
		else if(a<0 && b>0)
		{
			int c=a*b;
			System.out.println("multiple of a & b is="+c);
		}
		else
		{
			System.out.println("no operation");
		}
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a values");
		int a=sc.nextInt();
		System.out.println("enter  b values");
		int b=sc.nextInt();
		int a=10;
		int b=40;
		int c=a*b;
	    int d=b+c;
	    int e=d-c;
	    int f=d/e;
	    
		System.out.println("multiple of a & b is="+c);
		System.out.println("addition of b & c=" +d);
		System.out.println("subtraction of c & d=" +e);
		System.out.println("division of d & e =" +f);*/
		
	}

}
