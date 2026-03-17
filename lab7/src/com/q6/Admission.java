package com.q6;

import java.util.Scanner;

class Course
{
	int memberId;
	String Description;
	float duration;
	float fees;

	Course(int id,String des,float duration,float fees)
	{
		memberId=id;
		Description=des;
		this.duration=duration;
		this.fees=fees;
	}

	void GetData()
	{
		System.out.println("Member id "+memberId+" Description "+Description+" Duration "+duration+" and fees is "+fees);
	}
}

public class Admission 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number of members ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Course S[]=new Course[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter member id, description ,duration and fees");
			int id=sc.nextInt();
			
			String des=sc.nextLine();
			sc.nextLine();
			float du=sc.nextFloat();
			float fe=sc.nextFloat();
			S[i]=new Course(id,des, du, fe);
		}

		for(int i=0;i<n;i++)
		{
			S[i].GetData();
		}
	}

}
