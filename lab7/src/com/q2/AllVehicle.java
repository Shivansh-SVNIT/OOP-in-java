package com.q2;

import java.util.Scanner;

class Vehicle
{
	int maxSpeed;
	void maxSpeed()
	{
		System.out.println("max speed is "+maxSpeed);
	}
}

class Car extends Vehicle
{

	void maxSpeed()
	{
		System.out.println("max speed of car is "+maxSpeed);
	}

}
class Bicycle extends Vehicle
{
	void maxSpeed()
	{
		System.out.println("max speed of bicycle is "+maxSpeed);
	}
}
class Scooter extends Vehicle
{
	void maxSpeed()
	{
		System.out.println("max speed of scooter is "+maxSpeed);
	}
}

public class AllVehicle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Car c=new Car();
		System.out.println("Enter the max speed of car");
		c.maxSpeed=sc.nextInt();
		
		Bicycle b=new Bicycle();
		System.out.println("Enter the max speed of bicycle");
		b.maxSpeed=sc.nextInt();
		
		Scooter s=new Scooter();
		System.out.println("Enter the max speed of scooter");
		s.maxSpeed=sc.nextInt();
		
		c.maxSpeed();
		b.maxSpeed();
		s.maxSpeed();


	}

}
