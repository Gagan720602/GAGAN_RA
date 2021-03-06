package com.gagan.cods;
import java.util.*; 

public class ScannerClass {
	
	public static void main(String...args)
	{
		 Scanner sc=new Scanner(System.in);
		 
		 String name=sc.nextLine();
		 int   age=sc.nextInt();
		 double year=sc.nextDouble();
		 long   mob=sc.nextLong();
		 
		 
		 System.out.println("name="+name);

		 System.out.println("age="+age);

		System.out.println("year of passing ="+year);
		
		 System.out.println("mobile number="+mob);
	}

}
