package com.q7;

import java.util.Scanner;

class quesion
{
	int number;
	char anskey;
	char userKey;
	String result;
	void initialisation(char anskey)
	{
		this.anskey=anskey;
	}
}

class quesionPaper
{
	int n;
	quesion q[];
	int Correct=0;

	quesionPaper(int n)
	{
		this.n=n;
		q=new quesion[n];
		for(int i=0;i<n;i++)
		{
			q[i]=new quesion();
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Answer Key ");
		String ans=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			q[i].initialisation(ans.charAt(i));
		}
	}
	void EnteredAnsware()
	{
		String ans;
		System.out.println("Enter Answare Entered by user iN string");
		Scanner sc =new Scanner(System.in);
		ans=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			q[i].userKey=ans.charAt(i);
			if(q[i].userKey==q[i].anskey)
			{
				q[i].result="Correct";
				Correct++;
			}
			else
			{
				q[i].result="Incorrect";
			}
		}

	}
	void Report()
	{
		System.out.println();
		System.out.println("Quetion"+"\t\t"+"Correct Answare \t"+"User Answare\t"+"        result");
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+"\t\t"+q[i].anskey+"\t\t\t"+q[i].userKey+"\t\t"+q[i].result);
		}
		System.out.println("Corrct Vs Incorrect "+Correct+" / "+(n-Correct));
	}
}

public class quiz {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of quetion");
		quesionPaper paper=new quesionPaper(sc.nextInt());
		paper.EnteredAnsware();
		paper.Report();


	}

}
