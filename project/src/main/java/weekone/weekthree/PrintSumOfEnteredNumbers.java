package weekthree;

import java.util.Scanner;

public class PrintSumOfEnteredNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		do
		{
			System.out.println("Enter the Number");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			System.out.println(" entered numbers:"+n);
			sum=sum+n;
		}
		while(n>=0);
		System.out.println(" entered :"+n);
		System.out.println("Sum of the all entered numbers:"+sum);

	}

}

/*Enter the Number
5
Enter the Number
2
Enter the Number
5
Enter the Number
0
Sum of the all entered numbers:12*/


