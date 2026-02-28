package com.q2;

public class TotalIncome {
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter NNumber of Attendees :");
        int n = sc.nextInt();
        System.out.println("The Show Earns : "+(float)(n*5.0-20-n*(0.5)));
    }
	

}
