package com.q5;

import java.util.Scanner;

public class Perturn {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter pattern: ");
        sc.nextInt();
        String pattern = sc.nextLine();
        int count = 0;
        for (int i = a; i <= b; i++) 
        {
            String num = String.valueOf(i);
            if (num.contains(pattern)) 
            {
                count++;
            }
        }
        System.out.println("The number of times " + pattern + " occurred between " + a + " to " + b + " : " + count);
        sc.close();
    }
	 
}
