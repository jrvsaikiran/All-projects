package trail;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("elements=== ");
		for(int i=1; i<arr.length; i=i+2)
		{
			
			System.out.println(arr[i]);
		}

		
		String s1 = "fh56gf78uE4T6s4566ug7646";
		String st1 = s1.replaceAll("[A-Z,a-z]", "");
		String st2 = s1.replaceAll("[0-9]","");
		//String st3 = s1.replaceAll("[!@#$%^&*()]","");
		System.out.println(st1);
		System.out.println(st2);
		//System.out.println(st3);
		
		
		
		
		 int[] arr1 = { 12, 99, 122, 05, 46, 1234 };
	        
	        int largest = 0, secondLargest = 0, thirdLargest = 0;

	        for (int i = 0; i < arr1.length; i++) 
	        {
	            if (arr1[i] > largest) 
	            {	                
	                secondLargest = largest;
	                largest = arr1[i];
	            } 
	            else if (arr1[i] > secondLargest)
	            {	                
	                thirdLargest = secondLargest;	               
	                secondLargest = arr1[i];

	            }
	            else if (arr1[i] > thirdLargest) 
	            {
	               thirdLargest = arr1[i];
	            }
	        }
	        
	        System.out.println("Largest = " + largest);
	        System.out.println("Second Largest = " + secondLargest);
	        System.out.println("Third Largest = " + thirdLargest);


		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
