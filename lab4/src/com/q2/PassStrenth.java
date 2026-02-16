package com.q2;

import java.util.Scanner;


class Password
{
	static void check(String Pass)
	{
		int f1=0,f2=0,f3=0;
		
		for(int i=0;i<Pass.length();i++)
		{
			if(Pass.charAt(i)=='a' || Pass.charAt(i)=='e' ||Pass.charAt(i)=='i' ||Pass.charAt(i)=='u' ||Pass.charAt(i)=='o')
			{
				f1=1;
			}
			if(Pass.charAt(i)=='1' || Pass.charAt(i)=='2' ||Pass.charAt(i)=='3' ||Pass.charAt(i)=='4' ||Pass.charAt(i)=='5' ||Pass.charAt(i)=='6' ||Pass.charAt(i)=='7' ||Pass.charAt(i)=='8' ||Pass.charAt(i)=='9' ||Pass.charAt(i)=='0')
			{
				f2=1;
			}
		}

		if(f1==1 && f2==1)
		{
			for(int i=0;i<Pass.length();i++)
			{
				if((Pass.charAt(i)>='A' && Pass.charAt(i)<='Z') || Pass.charAt(i)=='!' || Pass.charAt(i)=='@' || Pass.charAt(i)=='#' || Pass.charAt(i)=='$' || Pass.charAt(i)=='%' || Pass.charAt(i)=='^' || Pass.charAt(i)=='&' || Pass.charAt(i)=='*')
				{
					f3=1;
				}		
			
			}
			if(f3==0)
			{
				if(Pass.length()>=5 && Pass.length()<=15)
				{
					if(Pass.contains("abc") || Pass.contains("123") || Pass.contains("password") || Pass.contains("pass") || Pass.contains("qwerty"))
					{
						System.out.println("Password should not contain abc,123,password,pass,qwerty");
						System.out.println("Medium Password");
					}
					else
					{
						System.out.println("Strong Password");
					}
				}
				else
				{
					System.out.println("Include 5 to 15 characters");
					System.out.println("Medium Password");
				}
			}
			else
			{
				System.out.println("Do not includec special charecter or number");
				System.out.println("Medium Password");
			}
		}	
		else
		{
			System.out.println("Include one small latter or number");
			System.out.println("Weak Password");
		}
	}
}

public class PassStrenth {

	public static void main(String[] args)
		// TODO Auto-generated method stub
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		String s1=sc.nextLine();
		Password.check(s1);
	}

}
