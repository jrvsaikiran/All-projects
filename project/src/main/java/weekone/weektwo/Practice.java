package weekone.weektwo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int s1= 5;
		int rem, temp = s1,sum=0;
		while(s1>0) {
			 rem = s1 %10;
//			 System.out.println("rem "+rem);
			 sum =(sum*10)+rem;
//			 System.out.println("sum "+sum);
			 s1=s1/10;
			
//			 System.out.println("s1 "+s1);	
		}
		System.out.println(temp+" palindrom "+sum);
		
//		=========================
		
		String s ="sai";
		String r ="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+(s.charAt(i));
		}
		System.out.println(s+" palindrom "+r);
		
//		====================
		
		String k = "Automation";
		
		String k1;
		char p = ' ';
		for(int i=k.length()-1;i>=0;i--) {
			
			k1=k.substring(i);
//			k=k.replace(k.charAt(i),p );
			System.out.println(k1);		
		
	}
//		============================
		int b=1,c=1,a=5;
		while(c<=a) {
			b=b*c;
			c++;
				
		}
		System.out.println("factorial of a "+b);
		
//		=================
		int i=153;
		int n=i,sum1=0;
		while(n>0) {
			rem=n%10;
			sum1 = sum1+rem*rem*rem;
			n=n/10;
		}
		System.out.println(i+" armstrom "+sum1);
		
//		=========================================
		int a1=0,b1=1,c1;
		System.out.println("Fibonacci Series List");
		for(int i1=0;i1<=10;i1++) {
			 c1=a1+b1;
//			 System.out.println(a1+" ");
			 a1=b1;					 
			 b1=c1;	
			 System.out.println(a1+" ");
		}
		
//		=================================
		System.out.println("prime number Series List");

		String pm = "";
		for(int i1=1;i1<=100;i1++) {
			int counter= 0;
			for(int j=2;j<i1;j++) {
				if(i1%j==0) {
					counter = counter+1;
				}				
			}
			if (counter==0) {
				pm = pm + i1+" ";				
			}			
			}
		System.out.println(pm);
		
//		==============================
		System.out.println("leap years");
		int n1;
		for(int y=1900;y<=1905;y++) {
			if(y%4==0) {
				if(y%100==0) {
					if(y%400==0) {
						n1=1;
					}
					else
						n1=0;
				}
				else
					n1=1;
			}
			else 
				n1=0;
				
			if(n1==1) {
				System.out.println(y+" ");
				}
			else
				System.out.println(y+" not ");
		}
//		===========================
		System.out.println("remove and find duplicates of individual characters");
		String st = "google";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		char[] charArray = st.toCharArray();
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+"="+entry.getValue());
//			System.out.println(entry.hashCode());
		}
		}
//		===========================================
		System.out.println("remove and find duplicates of Words");
		String stri = "sai kiran sai kiran saisai";
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		String[] spString = stri.split(" ");
		for(String word : spString) {
			if(lmap.containsKey(word)) {
				lmap.put(word, lmap.get(word)+1);
			}
			else
				lmap.put(word, 1);
		} 
		System.out.println(lmap);
		for(Entry<String, Integer> ent :lmap.entrySet()) {
			if(ent.getValue()>1)
				System.out.println(ent.getKey());
		}
//		==========================================================
		System.out.println("print triangle");
		int i1,j,l=6;
		for(i1=l;i1>0;i1--) {
			for(j=i1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
				
		}
//		=======================================================
		System.out.println("Largest number in array");
		int[] array = {28,4,66,7};
		int length = array.length;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)+"length - "+length);
		int m = array[length-1];
		System.out.println("largest number - "+m);
//		==========================================
		System.out.println("arrays at even position");
		int[] aray = {2,6,4,7,5};
		for(int i11=1;i11<=array.length;i11=i11+2) {
			System.out.println(aray[i11]);
		}
//		==========================================
		System.out.println("arrays at odd position");
		int[] aray1 = {2,6,4,7,5};
		for(int i11=0;i11<=array.length;i11=i11+2) {
			System.out.println(aray1[i11]);
		}
//		==============================================
		System.out.println("remove duplicates in array");
		int[] ary = {3,4,5,3,4,6,7,8};
		Set<Integer> set = new HashSet<>();
		for(int aa:ary) {
			set.add(aa);
		}
		System.out.println(set);
//		==========================================
		int[] ara = {311,5,3,1,2,66,31,3};
		int FL=0,SL=0,TL=0;
		for(int y=0;y<ara.length;y++) {
			if(ara[y]>FL) {
				SL=FL;
				FL=ara[y];
			}
			else if(ara[y]>SL){
				TL=SL;
				SL=ara[y];
			}else if (ara[y]>TL) {
				TL=ara[y];
			}				
		}
		System.out.println("1st,2nd,3rd largest "+FL+","+SL+","+TL);
//		=====================================
		System.out.println("Alternate letters in uppercase");
		String up = "sai kiran";
		String[] split = up.split(" ");
		for(String sp:split) {
			int w=0;
			for(char ch:sp.toCharArray()) {				
				if( w%2==0) {
					System.out.print(Character.toUpperCase(ch));
				}
				else {
					System.out.print(Character.toLowerCase(ch));
				}
				w++;				
			}
			System.out.print(" ");
		}
		System.out.println("------");
//		=================================
		System.out.println("reverse string");
		String sv = "jrv sai kiran";
		String[] split2 = sv.split(" ");
		String rev = " ";
		for(int e=split2.length-1;e>=0;e--) {
			 rev= rev+ split2[e]+" ";
		}
		System.out.println(rev);
//		====================================
		System.out.println("alter positions in string ");
		String u = "0123456";
		char[] charArray2 = u.toCharArray();
		System.out.println(charArray2);
		char current = charArray2[0];
		for(int d=1;d<charArray2.length;d+=2) {
			char next = charArray2[d];
			 charArray2[d] = current;
			 current=next;
		}
		charArray2[0] = current;
		String sy = new String(charArray2);
		System.out.println(sy);
//		=========================================
		
		
		
		
	}
}
