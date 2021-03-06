/* Print all the prime numbers which are below the given number separated by comma
Input: 50
Output: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47*/

package com.gagan.cods;

import java.util.Scanner;

public class NumBelow {
	 static boolean checkprime(int z)
	{
		for(int i=2;i<z;i++)
		{
			if(z%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void test(int x)
	{
    
		for(int i=2;i<x;i++)
		{
			if(checkprime(i))
			{
				System.out.print(i+",");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        test(sc.nextInt());	

	}

}
