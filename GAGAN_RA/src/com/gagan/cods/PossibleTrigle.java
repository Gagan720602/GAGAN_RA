
/* Find the number of all possible triplets in the array that 
 * can form the triangle( condition is a+b>c).*/
package com.gagan.cods;

import java.util.Arrays;
import java.util.Scanner;

public class PossibleTrigle {
	public static int test(int b[])
	{
		int count=0;
		Arrays.sort(b);
		for(int i=0;i<b.length-2;i++)
		{
			if(b[i]+b[i+1]>b[i+2])
			{
				count++;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	  int len=s.nextInt();
	  System.out.println(" length of the array "+len);
		int a[]=new int[len];
		System.out.println("enter the "+len+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(test(a));
		
		
	}

}
