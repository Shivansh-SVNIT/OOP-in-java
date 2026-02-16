package com.q3;

import java.util.Scanner;


public class PrintString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1;
		s1=sc.nextLine();
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		sc.close();
		System.out.println("String after n is '"+s1.substring(n)+"'");
	}

}
