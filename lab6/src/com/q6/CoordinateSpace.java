package com.q6;

import java.util.Scanner;

class Cooordinate
{
    int x;
    int y;
    int z;

    void input(int a, int b, int c)
    {
        x = a;
        y = b;
        z = c;
    }
    void display()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    void distanceOfOrigin()
    {
        double distance = Math.sqrt(x*x + y*y + z*z);
        System.out.println("Distance from origin: " + distance);
    }
}

public class CoordinateSpace 
{
    public static void main(String[] args) 
    {
        Cooordinate c1 = new Cooordinate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x, y, z coordinates:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        c1.input(x, y, z);
        c1.display();
        c1.distanceOfOrigin();
        sc.close();
    }

}
