package org.test;

import java.util.Scanner;

public class EmployeeInfo{
	private static Scanner s1;

	public static void main(String[] args) {
	
		String s="Ananad";
		int a = s.length();
		int b = s.indexOf('b');
		System.out.println(a);
		System.out.println(b);
		int c = s.indexOf('a');
		System.out.println(c);
		boolean bl = s.isEmpty();
		System.out.println("boolean variable output is: "+bl);
		/*//String k= "keerthana";
		System.out.println(5("1."+k));
		System.out.println("2."+k);
		System.out.println("3."+k);
		System.out.println("4."+k);*/
		System.out.println("How many times do u want to print");
		s1 = new Scanner(System.in);
		int d=s1.nextInt();
		System.out.println("Enter the value to print "+d+" times");
		String name=s1.next();
		
		for(int i=1; i<=d; i++)
		{
			if(i==5) {
				
				System.out.println("this is 5th statement so we are skipping");
				continue;
				//break;
				
			}
			System.out.println(i+"."+name);
		}
		
	}

}
