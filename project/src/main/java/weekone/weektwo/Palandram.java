package weektwo;

import java.util.Scanner;

public class Palandram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String original;
		  String reverse = ""; // to store reverse of string
		 
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	       original = in.nextLine();  
	       
	      // reverse = in.nextLine();
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )
	
	         reverse = reverse + original.charAt(i);  
	      System.out.println("reversed number/string is=" +reverse);
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");  
		
		
	      
	      

		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		  int n= sc.nextInt();
		  
		  int remainder,sum=0,temp;    
		  //int n=454;
		  
		  temp=n;    
		  while(n>0){    
		   remainder=n%10;   
		   sum=(sum*10)+remainder;    
		  n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
	
	}

}
