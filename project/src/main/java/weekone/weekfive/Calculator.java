package weekfive;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator obj = new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 'a' value");
		int a = sc.nextInt();
		System.out.println("enter 'b' value");
		int b= sc.nextInt();
		
		obj.subtraction(a,b);
		obj.addition(a, b);
		
	}

	private void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println(c);
	}
	
	public void addition(int a,int b) {
		int d=a+b;
		System.out.println(d);
		
		
	}
	
	

}
