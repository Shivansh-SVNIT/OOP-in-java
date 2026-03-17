package com.q4;

class Teacher
{
	String Name;
	String Department;
	void dispaly()
	{
		System.out.println("Name and Department is "+Name+" "+Department);
	}
}

class Student extends Teacher
{
	int rollnumber;
	void dispalyRoll()
	{
		System.out.println("roll is "+rollnumber);
	}
}

public class Class 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		t1.Name="Bindira";
		t1.Department="Ai";
		t1.dispaly();
		Student s1=new Student();
		s1.Name="Raju";
		s1.Department="CSE";
		s1.rollnumber=14;
		System.out.println();
		s1.dispaly();
		s1.dispalyRoll();

	}

}
