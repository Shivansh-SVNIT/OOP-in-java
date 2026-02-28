package com.q1;

import java.util.Scanner;

class Department
{
	String Name;
    int year;
	
	Department()//default constructor
	{
		super();
	}
	
	Department(String Name,int year)
	{
		this.Name=Name;
        this.year=year;
	}
	
    void Display()
    {
        System.out.println("Department is "+Name);
        System.out.println("Year is "+year);
    }
	
}

class Student extends Department
{
	String Name;
    int rollNumber;
	Student(String StudentName,String dept,int year,int rollNumber)
    {
        this(dept, year);
        this.rollNumber=rollNumber;
        this.Name=StudentName;
    }
    Student(String dept,int year)
    {
        super(dept,year);
    }
    void Display()
    {
        System.out.println("Student Name is "+Name);
        super.Display();
        System.out.println("Roll Number is "+rollNumber);
    }
}

public class ImplimatingSuperThis 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name, Department, Year of Joining and  Roll Number, respectively:");
        Student s1= new Student(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
        sc.close();
        s1.Display();
    }
}
