package weekthree;

public class PrimeNumbers1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       String  primeNumbers ="";

	       for (int i = 1; i <= 11; i++)         
	       { 		  	  
	          int counter=0; 
	          System.out.println("i value "+i);
	          for(int j =2; j<i; j++)
	          {
	        	  System.out.println(i+" i&j "+j);
	             if(i%j==0)
		     {
	            	 System.out.println(i+" i%%%j "+j);
	            	 counter = counter + 1;
		     }
	          }
	          if (counter ==0)
	          {
		     //Appended the Prime number to the String
		      primeNumbers = primeNumbers + i +" ";
	          }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.print(primeNumbers);
		
	}

}

/*
Prime numbers from 1 to 100 are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/
