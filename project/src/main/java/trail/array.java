package trail;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class array {
	
	

	public static void  main(String[] args)
    {
		// TODO Auto-generated method stub
		
		 Set<Integer> set = new HashSet<Integer>();
		 int a[] = {5,2,6,8,6,7,5,2,8};
     // adding elements to LinkedHashSet
     for (int i = 0; i < a.length; i++)
         set.add(a[i]);

     // Print the elements of LinkedHashSet
     System.out.print("remove duplicates in array" +set);
		
	}
	
	

}
