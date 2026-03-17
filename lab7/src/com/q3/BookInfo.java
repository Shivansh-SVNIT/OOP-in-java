package com.q3;

import java.util.Scanner;

class Book 
{
    protected int bookId;
    protected String title;
    protected String author;
    protected double price;

    public Book(int bookId, String title, String author, double price) 
	{
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book 
{
    private String period;

    public Periodical(int bookId, String title, String author, double price, String period) 
	{
        super(bookId, title, author, price);
        this.period = period;
    }

    public void modifyPrice(double newPrice) 
	{
        this.price = newPrice;
    }

    // Behavior: Modify the Period
    public void modifyPeriod(String newPeriod) 
{
        this.period = newPeriod;
    }

    // Behavior: Display details
    public void displayDetails() 
{
        System.out.println("   Periodical Details   ");
        System.out.println("ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Period: " + period);
    }
}

public class BookInfo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book ID, Title, Author, Price and Period:");
		Periodical periodical = new Periodical(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
		periodical.displayDetails();

	}

}
