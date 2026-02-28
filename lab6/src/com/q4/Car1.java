package com.q4;

import java.util.Scanner;

abstract class Car
{
	int avg;
	int speed;
	int numberOfWheels;
	void display()
	{
		System.out.println("This is a car");
	}
	abstract void average(int avg);
	abstract void Mode();
}

class sentro extends Car
{
	sentro()
	{
		numberOfWheels=4;
	}
	public void average(int avg)
	{
		System.out.println("Average is "+avg+"km/l");
	}
	public void Mode()
	{
		System.out.println("Mode is petrol");
	}
}

class maruti extends Car
{
	maruti()
	{
		numberOfWheels=4;
	}
	public void average(int avg)
	{
		System.out.println("Average is "+avg+"km/l");
	}
	public void Mode()
	{
		System.out.println("Mode is petrol");
	}
}

public class Car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sentro s=new sentro();
		s.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the average of sentro");
		int avg=sc.nextInt();
		s.average(avg);
		s.Mode();
		maruti m=new maruti();
		m.display();
		System.out.println("Enter the average of maruti");
		int avg1=sc.nextInt();
		m.average(avg1);
		m.Mode();
		sc.close();

	}

}
