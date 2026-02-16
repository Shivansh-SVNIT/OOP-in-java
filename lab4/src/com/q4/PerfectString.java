package com.q4;

import java.util.Scanner;

public class PerfectString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		
		String s1;
		s1=sc.nextLine();

		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println("Imperfect String");
					return;
				}
			}
		}
		System.out.println("perfect String");
		sc.close();

	}
}
