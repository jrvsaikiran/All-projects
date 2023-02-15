package trail;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int temp=1;
		for(int i=1;i<=5;i++) {
			temp=i*temp;
		}
		System.out.println(temp);
		*/
		/*
		int n=123;
		int rem;
		int rev =0;
		int temp =n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			System.out.println(rev);
		
		}
		
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		} 
			
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();*/
		
		//String operation = ("add","sub");
	//int operation;
	/*switch (operation) {
	
	
	case add:
		c=a+b;
		System.out.println(c);
		break;
		
	case sub:
		c=a-b;
		System.out.println(c);
		break;
		
	case multpli:
		c=a*b;
		System.out.println(c);
		break;
		
	case div:
		c=a/b;
		System.out.println(c);
		break;
		
	default:
		break;
	}*/	
		
		
		/*String str = "mamm";

		String rev = "";

		for(int i=str.length()-1; i>=0; i--){

		rev = rev+str.charAt(i);
		//System.out.println(rev);
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("............palindrome");
		}
		else {
			System.out.println("not palindrome");
		}*/
		
		
		/*if(temp==rev) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrong");
			
		} 
		*/
		
		
	/*	String primenumber = "";
		
		for(int i=2; i<=500;i++){
			 int counter=0;
			for(int j=2;j<i;j++){
			
				if(i%j==0){
			counter =counter+1;
			
			}
				//System.out.print(counter);
			}
			if(counter==0){
			primenumber = primenumber+i+" ";
			}
			
			
	
		
		}
		System.out.println(primenumber);
		*/

	/*	int n,sum=0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			 n = sc.nextInt();
			sum=sum+n;
			}
			while(n>0);
			System.out.println("sum of all entered numbers  "+sum);
			
		*/
		/*
		int sum=0;
		for(int i=1; i<10; i++)
		{
		if(i%3==0 || i%5==0 ) {
		 sum = sum+i;
		}
		
		}
		
		System.out.println(sum);
		
		*/
		
		
		
	/*	int a=0,b=1;
		for(int i=0;i<=4;i++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.print(b+",");
		
				}
*/
		
		
		
		/*String str ="google";
		//char[] str2char = str.toCharArray();
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<=str.length(); i++) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add(str.charAt(i));
		}
		for(Character c : set) {
			buf.append(c);
			
		}
		System.out.println(set);
		*/
		
		/*String s1 ="sai";
		String s2 =new String("sai");
		s1==s2;
		s1.equals(s2);
		System.out.println(s1);
		
		*/
		int num[] = {1,4,8,1,4,-7,45,85,74};
		int n = num.length;
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i=0; i<n ; i++) {
			if(num[i]>highest) {
				highest = num[i];
				
			}
			
			if(num[i]<highest && num[i]>secondHighest) {
				secondHighest =num[i];
			}
			
		}
		System.out.println(secondHighest);
		System.out.println(n);
		System.out.println(highest);
		
		
		Select sc = new Select(driver);
		
		
		
		
		
		
		
}
}
