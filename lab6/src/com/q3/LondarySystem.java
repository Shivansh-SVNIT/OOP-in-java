package com.q3;

import java.util.Scanner;

class WashingMachine
{
	int n;
	double detergent;
	void switchOn()
	{
		System.out.println("Waching Machine is On");
	}
	void switchOff()
	{
		System.out.println("Waching Machine is Off");
	} 
	int acceptCloths(int n)
	{
		this.n=n;
		return n;
	}
	void acceptDetergent(double detergent)
	{
		this.detergent=detergent;
	}
}


public class LondarySystem {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		WashingMachine wm=new WashingMachine();
		wm.switchOn();
		System.out.println("Enter the number of cloths");
		int n=sc.nextInt();
		n=wm.acceptCloths(n);
		System.out.println("Enter the amount of detergent");
		double detergent=sc.nextDouble();
		wm.acceptDetergent(detergent);
		wm.switchOff();

	}

}
