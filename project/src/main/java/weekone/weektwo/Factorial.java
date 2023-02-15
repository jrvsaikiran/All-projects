package weektwo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number to find factorial:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int fact=1;
		//int x=4;
		for(i=1;i<=100;i++) 	
				{
					fact=fact*i;
				
				} 
				System.out.println("factorial is :- "+fact);
		

					 
		
		
	
	
		 System.out.println("Enter the number to which you need to find the factorial");
			Scanner sc11 = new Scanner(System.in);
	      int j =1, b=1, a;
	      //Scanner sc11 = new Scanner(System.in);
	      a = sc11.nextInt();
	
	      while(j <=a) {
	         b = b * j;
	         j++;
	      }
	      System.out.println("Factorial of the given number is:: "+b);
	}
		
		
		/*
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of a : ");

		int a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		
		int b = sc.nextInt();
		
		for(a=1; a<4; a++) {
			
			b = a*b;
			
		}
		
		System.out.println("sum of factorial is:" +b);
		
		*/
		
		
		
		
		/*
		 int i=6,factorial=1;  
		  for(i=1;i<=6;i++){    
		      factorial= i*factorial;    
		  }    
		  System.out.println("Factorial of number is:" +factorial); 
		
		
		*/
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		int num = 4;
        long factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    */
        
        
      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


