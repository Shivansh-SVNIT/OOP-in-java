package com.q1;

class QueueOverFlow extends Exception
{
	
}

class QueueUnderFlow extends Exception
{
	
}

interface Queue
{
	void insert(int value);
	void delete();
	void display();
}

class QueueImpl implements Queue
{
	
	int arr[]=new int[10] ;
	int front=-1;
	int size=0;
	
	public void insert(int value) 
	{
		
			arr[size]=value;
			size++;
			size%=10;
		
		if(front==-1) front=0;
	}
	public void delete()
	{
		if(front==-1)
		{
			System.out.println("Empty");
		}
		else
		{
			front++;
			front%=10;
		}
	}
	public void display()
	{
		System.out.println();
		System.out.println("queue is");
		if(front==-1)
		{
			System.out.println("Empty");
		}
		else if(front<size)
		{
			for(int i=front;i<=size-1;i++)
			{
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=front;i<=9;i++)
			{
				System.out.println(arr[i]+" ");
			}
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}

		
}

public class busTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImpl q=new QueueImpl();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.insert(70);
		q.insert(80);
		q.insert(90);
		q.insert(100);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.insert(70);

		q.display();

		q.delete();
		q.delete();
		q.delete();

		q.display();

		q.delete();
		q.delete();
		q.delete();

		q.display();

		q.delete();
		q.delete();
		q.delete();

		q.display();

		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.insert(70);

		q.display();



	}

}
