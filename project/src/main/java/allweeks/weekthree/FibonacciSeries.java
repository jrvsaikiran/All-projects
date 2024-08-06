package weekthree;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 int a = 0, b = 1;
//		 
//		 System.out.println("Enter number of terms :");
		 	
		 Scanner sc = new Scanner(System.in);
		 	
//		 	 int n = sc.nextInt();
//		 	 
//		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 0; i <= 7; i++) {
		    	 
//				 System.out.println("Enter number of terms :"+i);
		    	
		    	 int c = a + b;
//		    	  b = c;
		    	 System.out.print(a+" ");
		    	 a = b;
			     b = c;
		    	
		      
		      
		    }
//		    System.out.print(a+",");
	}

}

/*
Enter number of terms :
5
Fibonacci Series till 5 terms:
1,1,2,3,5,*/
